package com.course.books;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Library {
	// 2. Define the single instance as a static member
	private static Library theInstance = new Library();
	
	private Book[] books = new Book[1000];
	private int numOFBooks;
	private String nameOfLibrarian = "Frida";
	
	// 1. private constructor - no one from the outside can 
	// create objects
	public Library()
	{
	}
	
	// 3. Define an access method for the user
	public static Library getInstance()
	{
		return theInstance;
	}
	
	///////////////////////
	///// Library code ////
	///////////////////////
	public void addBook(Book b)
	{
		books[numOFBooks++] = b;
	}
	
	
	
	@Override
	public String toString() {
		return "Library [books=" + Arrays.toString(books) + ", numOFBooks="
				+ numOFBooks + ", nameOfLibrarian=" + nameOfLibrarian + "]";
	}

	public void dump(DataOutputStream out) throws IOException
	{
		out.writeUTF(nameOfLibrarian);
	
		out.writeInt(numOFBooks);
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null)
			{
				books[i].dump(out);
			}
		}
	}
	
	public void load(DataInputStream in) throws IOException
	{
		nameOfLibrarian = in.readUTF();
		numOFBooks = in.readInt();
		for (int i = 0; i < numOFBooks; i++) {
			books[i] = new Book();
			books[i].load(in);
		}
	}
}
