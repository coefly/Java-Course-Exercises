package ntuOopExercises;

public class TestBook {
	
	public static void main(String[]args)
	{
		// b1 = a book constructed without any quantity in stock
		Book b1 = new Book("Java for Lior b1", 12.5);
		
		// b2 = a book constructed with a quantity in stock
		Book b2 = new Book("Java for Lior b2", 12.5, 7);
		
		// Printing both books. b1 in an Explicit call. b2 in an Implicit call
		System.out.println(b1.toString()); //Explicit calling to b1
		System.out.println(b2); //Implicit calling to b2
		
	}

}
