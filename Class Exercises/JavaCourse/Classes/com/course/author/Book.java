package com.course.author;

public class Book 
{
	//
	// Attributes
	//
	private String name;
	private Author[] authors = new Author[5];
	private int numOfAuthors = 0;
	private double price = 0;
	private int qtyInStock = 0;
	
	public Book(String name, double price)
	{
		// Pass the values to another constructor
		this(name, price, 0);
	}
	
	public Book(String name, double price, 
			int qtyInStock)
	{
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	//
	// Methods
	//
	public void addAuthor(Author a)
	{
		// If there is no more room:
		if (numOfAuthors == authors.length)
		{
			resizeArray();
		}
		
		authors[numOfAuthors] = a;
		numOfAuthors++;
	}
	
	public void removeAuthor(String name)
	{
		for (int i = 0; i < authors.length; i++) {
			// Don't forget to check for null!
			if (authors[i] != null && 
				authors[i].getName() == name)
			{
				// Move the last author to replace this one
				authors[i] = authors[numOfAuthors - 1];
				authors[numOfAuthors - 1] = null;
				
				numOfAuthors--;
				return;
			}
		}
	}
	
	public void addAuthor2(Author a)
	{
		for (int i = 0; i < authors.length; i++) {
			// Look for the first empty slot
			if (authors[i] == null)
			{
				authors[i] = a;
				numOfAuthors++;
				break;
			}
		}
		
	}
	
	public void removeAuthor2(String name)
	{
		for (int i = 0; i < authors.length; i++) {
			// Don't forget to check for null!
			if (authors[i] != null && 
				authors[i].getName() == name)
			{
				authors[i] = null;
				numOfAuthors--;
				return;
			}
		}
	}
	
	// This is dangerous - encapsulation wise
	public Author[] getAuthors() {
		// To be on the safe side - we will return a copy 
		// of the array and not the array itself
//		Author[] copy = new Author[authors.length];
//		System.arraycopy(authors, 0, copy, 0, authors.length);
//		
//		return copy;
//		
		return authors.clone();
		// This is safe - but expensive!! 
		// TODO: think of something better
	}
	
	public void printAuthors()
	{
		// Print the names of all the authors
		for (int i = 0; i < authors.length; i++) {
			if (authors[i] != null)
			{
				System.out.println(authors[i].getName());
			}
		}
	}
	
	@Override
	public String toString() {
		return name + " by " + numOfAuthors + " authors";
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	
	public int getQtyInStock()
	{
		return qtyInStock;
	}
	
	public void setQtyInStock(int qty)
	{
		// TODO: check the qty
		this.qtyInStock = qty;
	}
	
	public void setPrice(double price)
	{
		if (price > 0)
		{
			this.price = price;
		}
	}
	
	private void resizeArray()
	{
		System.out.println("Resizing array. Current size: " + authors.length);
		// 1. create a new temp array
		Author[] temp = new Author[authors.length + 1];
		
		// 2. copy all values to the new array
		for (int i = 0; i < authors.length; i++) {
			temp[i] = authors[i];
		}
		
		// 3. redirect the reference to the new array
		authors = temp;
	}
	
	
	
}
