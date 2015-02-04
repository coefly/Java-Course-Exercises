package com.course.io;

import java.io.*;
import java.util.Arrays;

public class TestCopyFile {

	public static void main(String[] args) 
	{
		try {
			// copyFile("readme.txt", "writeme.txt");
			copyFile("Penguins.jpg", "penguin2.jpg");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void copyFile(String src, String dest) throws IOException
	{
		// Create streams
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		
		// Read and write
		int bytesRead = 0;
		byte[] buff = new byte[128];
		while ((bytesRead = in.read(buff)) > 0)
		{
			out.write(buff, 0, bytesRead);
			// Clean the buffer before we re-fill it
			// Arrays.fill(buff, (byte)0);
			// buff = new byte[128];
		}
		
		// Don't forget to close the streams
		in.close();
		out.close();
	}
}
