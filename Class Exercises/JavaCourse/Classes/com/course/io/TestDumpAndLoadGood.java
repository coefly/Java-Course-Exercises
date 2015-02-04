package com.course.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.course.books.Book;

public class TestDumpAndLoadGood {

	public static void main(String[] args) throws Exception 
	{
		Book b1 = new Book("author1", "title1", 19.8);
		Book b2 = new Book("author2", "title2", 119.8);
		
		// Create out stream
		DataOutputStream dOut = 
				new DataOutputStream(
						new FileOutputStream("book.dat"));
		b1.dump(dOut);
		b2.dump(dOut);
		
		dOut.close();
		
		
		// In another time, at another place
		DataInputStream dIn = 
				new DataInputStream(
						new FileInputStream("book.dat"));
		
		Book bb1 = new Book();
		Book bb2 = new Book();
		
		bb1.load(dIn);
		bb2.load(dIn);
		
		System.out.println(b1);
		System.out.println(bb1);
		System.out.println(b1.equals(bb1));
			
	}

}

