package com.course.author;

public class TestBook {
	public static void main(String[] args) {
		
		Author author = new Author("kuku1", "kuku1@kuku.com", 'm');
		
		Book b1 = new Book("name1", 15);
		b1.addAuthor(author);
		b1.addAuthor(new Author("kuku2", "kuku2@kuku.com", 'm'));
		b1.addAuthor(new Author("kuku3", "kuku3@kuku.com", 'f'));
		b1.addAuthor(new Author("kuku4", "kuku4@kuku.com", 'm'));
		b1.addAuthor(new Author("kuku5", "kuku5@kuku.com", 'm'));
		b1.addAuthor(new Author("kuku6", "kuku6@kuku.com", 'm'));
		b1.addAuthor(new Author("kuku7", "kuku7@kuku.com", 'm'));
		b1.addAuthor(new Author("kuku5", "kuku5@kuku.com", 'm'));
		b1.addAuthor(new Author("kuku6", "kuku6@kuku.com", 'm'));
		b1.addAuthor(new Author("kuku7", "kuku7@kuku.com", 'm'));
		
		b1.printAuthors();
		
//		System.out.println("***************************");
//		// Test program
//		Book javaDummy = new Book("Java for Dummy", 19.99, 99);
//		System.out.println(javaDummy);  // toString()
//		System.out.print("The authors are: ");
//		javaDummy.printAuthors();
//		
//		System.out.println("*******************************");
//		javaDummy.addAuthor(new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm'));
//		javaDummy.addAuthor(new Author("Paul Tan", "Paul@nowhere.com", 'm'));
//		System.out.println(javaDummy);  // toString()
//		System.out.print("The authors are: ");
//		javaDummy.printAuthors();
	
		
	}
}
