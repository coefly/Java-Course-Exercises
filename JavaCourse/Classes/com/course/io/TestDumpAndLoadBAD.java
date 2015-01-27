package com.course.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.course.books.Book;

public class TestDumpAndLoadBAD {

	public static void main(String[] args) throws Exception 
	{
		Book b1 = new Book("author1", "title1", 19.8);
		
		// Create out stream
		DataOutputStream dOut = 
				new DataOutputStream(
						new FileOutputStream("book.dat"));
		// IT is bad to write the protocol outside the class...
		dOut.writeUTF(b1.getTitle());
		dOut.writeUTF(b1.getAuthor());
		dOut.writeDouble(b1.getPrice());
		
		dOut.close();
		
		
		// In another time, at another place
		DataInputStream dIn = 
				new DataInputStream(
						new FileInputStream("book.dat"));
		String title = dIn.readUTF();
		String author = dIn.readUTF();
		double price = dIn.readDouble();
		
		Book b2 = new Book(title, author, price);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1.equals(b2));
			
	}

}
