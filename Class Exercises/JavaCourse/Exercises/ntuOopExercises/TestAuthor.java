package ntuOopExercises;

public class TestAuthor {
	
	public static void main(String[] args) {
		
	
//	// Creation of a test author a1
//	Author a1 = new Author("Lior", "lior@gmail.com", 'M');
//	System.out.println(a1.toString()); //Explicit calling to toString for a1
//	System.out.println(a1); //Implicit calling to toString for a1

	//Speaks about exercise 1.12	
		
	Book b1 = new Book ("Java for kaki", 10.90);
	b1.addAuthor(new Author ("Avner", "avner@gmail.com", 'M'));
	b1.addAuthor(new Author ("Lior", "avner@gmail.com", 'M'));
	b1.addAuthor(new Author ("Rami", "avner@gmail.com", 'M'));
	b1.addAuthor(new Author ("Yoni", "avner@gmail.com", 'M'));
	b1.addAuthor(new Author ("David", "avner@gmail.com", 'M'));
	b1.addAuthor(new Author ("Kuku", "avner@gmail.com", 'M')); //This should have exited the program if we didn't have the arrayLengthIncrease.
	

	for (int i = 0; i < b1.getAuthors().length; i++)
	System.out.println(b1.getAuthors()[i]);
	
	
	}
}
