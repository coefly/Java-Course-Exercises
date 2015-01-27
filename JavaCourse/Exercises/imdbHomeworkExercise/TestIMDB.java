package imdbHomeworkExercise;
import java.util.*;

public class TestIMDB {
	
	public static void main(String[] args) 
	{
		IMDB i1 = IMDB.getInstance(); //The instantiation of IMDB for singleton compliancy.
		
		//Option 1 for creating a set of actors.
		Set<String> actors1 = new HashSet<>();
		Collections.addAll(actors1, "eew", "qwqe");
		
		
		//Option 2 for creating a set of actors.
		Set<String> actors2 = new HashSet<>();
		actors2.add("Rami");
		actors2.add("Dana");
		actors2.add("Bat");
		actors2.add("Mahmud");
		
		//Option 3 for creating a set of actors.
		//TODO - Create another constructor in Movie which will receive a name and an array of strings
		//TODO - and with a loop will enter all names into the array of strings.
		
		//Adding movies to IMDB.
		try {
			i1.addMovie("Terminator", actors1);
			i1.addMovie("Sami Borekas", actors2);
			i1.addMovie("Borekas", actors2);
			i1.vote("Terminator", 6);
			i1.vote("Sami Borekas", 10);
		//The first vote for Borekas movie to check the Rank is changing.
			i1.vote("Borekas", 7);
		//The second vote for Borekas movie to check the Rank is changing.
			i1.vote("Borekas", 2);
		
		//Printing the top movies using the getTop method and calling the printList method from IMDB.
		//We are using i1.printList since printList is found inside IMDB class.
			//i1.printList(i1.getTop(2));
			
		//Printing the top movies using the printListInTheTest found in the TestIMDB class.
			printListInTheTest(i1.getTop(2));
			
		} catch (ImdbException e) {
			e.getMessage();
		}
		
		
		//Testing get all movies collection.
		System.out.println("\n" + i1.getMovies());
		
		
	}


public static void printListInTheTest(List<Movie> list)
{
	Iterator<Movie> iter = list.iterator();
	while (iter.hasNext())
	{
		Movie element = iter.next();
		System.out.println(element);
	}
}
}