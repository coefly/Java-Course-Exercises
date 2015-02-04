package com.course.tests;
import com.course.books.Book;


public class TestBook {
	public static void main(String[] args) 
	{
		Book b1 = new Book("Java for dummies", "misheu", 243);
		Book b2 = new Book("The egg", "someone", 299);
		Book b3 = new Book("title1", "author1", 876);
		Book b4 = new Book();
		
		
		b2.setPrice(100);
		
		b1.printMe();
		System.out.println("**********************");
		b2.printMe();
		System.out.println("***********************");
		b3.printMe();
		
		//System.out.println(b1.priceAfterTax(1.18));
		//System.out.println(b2.priceAfterTax(1.18));
		
		
		System.out.println(b2.getTitle());
		System.out.println(b3.getPrice());
		
		b3.setPrice(100);
		b3.setPrice(b3.getPrice() + 50);
		
		
		
	}
}
