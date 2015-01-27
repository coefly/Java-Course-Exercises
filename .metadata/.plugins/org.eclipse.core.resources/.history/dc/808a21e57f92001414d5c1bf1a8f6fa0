package com.course.exceptions;

import java.io.PrintWriter;

public class TestFinally2 {

	public static void main(String[] args) throws Exception{
		String[] names = { "Hello", "This is me", "Me again" };

		int i = 0;
		while (true) 
		{
			try 
			{
				System.out.println(names[i++]);
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("Exception");
				i = 0;
				e.printStackTrace();
				//return;
			} finally 
			{
				System.out.println("This is always printed");
			}
		}
	}

}
