package com.course.io;

import java.io.*;

public class TestCopyFileWithChars {

	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("readme.txt");
			FileWriter out = new FileWriter("writeme6.txt");
			
			int charsRead = 0;
			char[] buff = new char[128];
			
			while ((charsRead = in.read(buff)) != -1)
			{
				out.write(buff, 0, charsRead);
			}
			
			in.close();
			out.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
