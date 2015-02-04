package com.course.io;

import java.io.*;
import java.net.URL;

public class TestFilteredIO {

	public static void main(String[] args) throws Exception 
	{
		// Create input streams
		URL url = new URL("http://www.walla.co.il");
		InputStreamReader fr = new InputStreamReader(url.openStream());
		//InputStreamReader fr = new InputStreamReader(System.in);
	    //FileReader fr = new FileReader("readme.txt");
		BufferedReader bIn = new BufferedReader(fr);
		
		// Create output streams
		FileWriter fw = new FileWriter("output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pOut = new PrintWriter(bw);
		
		// Read and write
		String line = null;
		while ((line = bIn.readLine()) != null)
		{
			System.out.println(line);
			pOut.println(line);
		}
		
		pOut.close();
		bIn.close();
		
	}

}
