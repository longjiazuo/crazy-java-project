package org.light4j.net.udp;

import java.net.*;
import java.io.*;

public class UdpServer {
	public static final int PORT = 30000;
	// 定义每个数据报的最大大小为4K
	private static final int DATA_LEN = 4096;
	// 定义接收网络数据的字节数组
	byte[] inBuff = new byte[DATA_LEN];
	// 以指定字节数组创建准备接受数据的DatagramPacket对象
	private DatagramPacket inPacket = new DatagramPacket(inBuff, inBuff.length);
	// 定义一个用于发送的DatagramPacket对象
	private DatagramPacket outPacket;
	// 定义一个字符串数组，服务器发送该数组的的元素
	String[] books = new String[] { "设计模式", "数据结构", "编译原理" };

	public void init() throws IOException {
		try (
		// 创建DatagramSocket对象
		DatagramSocket socket = new DatagramSocket(PORT)) {
			// 采用循环接受数据
			for (int i = 0; i < 1000; i++) {
				// 读取Socket中的数据，读到的数据放入inPacket封装的数组里。
				socket.receive(inPacket);
				// 判断inPacket.getData()和inBuff是否是同一个数组
				System.out.println(inBuff == inPacket.getData());
				// 将接收到的内容转成字符串后输出
				System.out.println(new String(inBuff, 0, inPacket.getLength()));
				// 从字符串数组中取出一个元素作为发送的数据
				byte[] sendData = books[i % 4].getBytes();
				// 以指定字节数组作为发送数据、以刚接受到的DatagramPacket的
				// 源SocketAddress作为目标SocketAddress创建DatagramPacket。
				outPacket = new DatagramPacket(sendData, sendData.length,inPacket.getSocketAddress());
				// 发送数据
				socket.send(outPacket);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		new UdpServer().init();
	}
}