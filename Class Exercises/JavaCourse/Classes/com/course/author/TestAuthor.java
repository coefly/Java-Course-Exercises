package com.course.author;

public class TestAuthor {
	public static void main(String[] args) {
//		Author a1 = new Author("moshe", "moshe@moshe.com", 'z');
//		
//		System.out.println(a1.getEmail());
//		
//		a1.setEmail("moshe@kuku.com");
//		
//		System.out.println(a1.getEmail());
//		
//		
//		System.out.println(a1.toString());
		
		Author anAuthor = new Author("Tan Ah Teck", 
				"ahteck@somewhere.com", 'm');
		System.out.println(anAuthor);   // call toString()
		anAuthor.setEmail("paul@nowhere.com");
		System.out.println(anAuthor);
		
	}
}
