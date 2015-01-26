package com.course.books;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;



public class Book implements Serializable
{
	private static int counter = 0;
	
	private static final int MIN_PRICE = 10;
	
	
	//
	// Attributes
	//
	private String title;
	private String author;
	private transient double price;
	
	//
	// Constructor
	//
	// 1. same name as the class
	// 2. no return type
	public Book(String title, String author, double price)
	{
		// This function will be called ONLY ONCE whenever an object is created
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book()
	{
		counter++;
	}
	
	// In a static function there is no 'this'... 
	public static int getCounter() {
		// return price; // NO ACCESS to instance variables
		return counter;
	}
	//
	// Methods
	//
	
	// b1.printMe()
	public void printMe()
	{
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		
	}
	
	public double priceAfterTax(double tax)
	{
		return price * tax;
	}
	
	//
	// Getters and Setters
	//
	public String getTitle()
	{
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getAuthor() {
		return author;
	}
	

	public void setPrice(double price)
	{
		if (price > MIN_PRICE)
		{
			this.price = price;
		}
		else
		{
			System.out.println("Invalid price! " + price);
		}
	}
	
	@Override
	public String toString() {
		return "Book: title: " + title + 
				" author: " + author + 
				" price: " + price;  
	}
	
	// b1.equals(b2) -- this and obj
	public boolean equals(Object obj) {
		// optimization (b1.equals(b1)
		if (this == obj)
		{
			return true;
		}
		
		// Check that we got a book
		if (!(obj instanceof Book))
		{
			return false;
		}
		
		// Now we know it is a book - downcast
		Book other = (Book)obj;
		
		return (this.title.equals(other.title)) &&
			   (this.author.equals(other.author)); // &&
			  //(this.price == other.price);
		
	}
	
	public void dump(DataOutputStream out) throws IOException
	{
		out.writeUTF(title);
		out.writeUTF(author);
		out.writeDouble(price);
	}
	
	public void load(DataInputStream in) throws IOException
	{
		this.title = in.readUTF();
		this.author = in.readUTF();
		this.price = in.readDouble();
	}
}
