package com.course.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.course.books.Book;
import com.course.books.Library;

public class TestDumpLoadLibrary {

	public static void main(String[] args) throws Exception{
		// create the library
		Library lib1 = new Library();
		lib1.addBook(new Book("title1", "author1", 11));
		lib1.addBook(new Book("title2", "author2", 12));
		lib1.addBook(new Book("title3", "author3", 13));
		lib1.addBook(new Book("title4", "author4", 14));
		
		
		// Create out stream
		DataOutputStream dOut = 
				new DataOutputStream(
						new FileOutputStream("book.dat"));
		lib1.dump(dOut);
		
		dOut.close();
		
		
		// In another time, at another place
		DataInputStream dIn = 
				new DataInputStream(
						new FileInputStream("book.dat"));
		
		Library lib2 = new Library();
		lib2.load(dIn);
		
		System.out.println(lib1);
		System.out.println(lib2);
		
		
	}
}
