package org.light4j.exception.Throws;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsTest
{
	public static void main(String[] args)
		throws IOException
	{
		FileInputStream fis = new FileInputStream("a.txt");
	}
}