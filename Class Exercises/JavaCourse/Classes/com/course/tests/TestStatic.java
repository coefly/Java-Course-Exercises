package com.course.tests;

import com.course.books.Book;

public class TestStatic {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		Book b4 = new Book();
		
		System.out.println(b2.getPrice());
		
//		Book.counter = 10;
//		Book.counter = 15;
//		Book.counter = 20;
//		Book.counter = 25;
		
		System.out.println(Book.getCounter());
	}
}
