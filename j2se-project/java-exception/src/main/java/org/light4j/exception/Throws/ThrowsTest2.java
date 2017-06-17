package org.light4j.exception.Throws;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsTest2
{
	public static void main(String[] args) throws IOException
	{
		// 因为test()方法声明抛出IOException异常，
		// 所以调用该方法的代码要么处于try...catch块中，
		// 要么处于另一个带throws声明抛出的方法中。
		test();
	}
	public static void test()throws IOException
	{
		// 因为FileInputStream的构造器声明抛出IOException异常，
		// 所以调用FileInputStream的代码要么处于try...catch块中，
		// 要么处于另一个带throws声明抛出的方法中。
		FileInputStream fis = new FileInputStream("a.txt");
	}
}