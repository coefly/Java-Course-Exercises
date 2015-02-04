package com.course.io;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.course.books.Book;

public class TestSerialization {

	public static void main(String[] args) throws Exception{
		Book b1 = new Book("author1", "title1", 19.8);
		Book b2 = new Book("author2", "title2", 119.8);
		
		// Create out stream
		ObjectOutputStream dOut = 
				new ObjectOutputStream(
						new FileOutputStream("book.ser"));
		dOut.writeObject(b1);
		dOut.writeObject(b2);
		
		dOut.close();
		
		
		// In another time, at another place
		ObjectInputStream dIn = 
				new ObjectInputStream(
						new FileInputStream("book.ser"));
		
		Book bb1 = (Book)dIn.readObject();
		Book bb2 = (Book)dIn.readObject();
		
		dIn.close();
		System.out.println(b1);
		System.out.println(bb1);
		
	}

}
