package imdbHomeworkExercise;

import java.util.*;
import java.io.*;

import parkingHomeworkExercise.ParkingOld;

import com.course.shapes.MyPoint;

public class IMDB {
	
	//
	// Vriables
	//
	private Map<String, Movie> movies = new HashMap<>();
	
	//
	// Constructors
	//
	
	//Creation of IMDB for SingleTon.
	private static IMDB imdb = new IMDB();
	
	//no-arg constructor
	private IMDB()
	{
		
	}
	
	//
	// Methods
	//
	
	public static IMDB getInstance()
	{
		return imdb;
	}
	
	public Map<String, Movie> getMovies()
	{
		return Collections.unmodifiableMap(this.movies); //Wrapped in unmodifiablemap to prevent enemy from changing values.Read Only.
	}

	//Add a movie to IMDB - Receives a set of Strings... and a String name.
	public void addMovie(String name, String...actors) throws ImdbException
	{
		if (movies.containsKey(name))
		{
			throw new ImdbException("The entered movie name " + name + " already exists.");
		}
		movies.put(name, new Movie(name, actors));	
	}
	
	//Second method to Add a movie to IMDB - Receives a set of Strings and a String name.
	public void addMovie(String name, Set<String> actors) throws ImdbException
	{
		if (movies.containsKey(name))
		{
			throw new ImdbException("The entered movie name " + name + " already exists.");
		}
		movies.put(name, new Movie(name, actors));
	}
	
	/*Update the rank of a movie by passing a voting value to a movie name.
	 * Checkes for an exception of a movie that does not exist in IMDB.
	 */
	public double vote(String name, int voting) throws ImdbException
	{
		if (!name.equals(movies.get(name).getName()))
		{
			throw new ImdbException("The entered movie name " + name + " does not exist.");
		}
		movies.get(name).updateRank(voting);
		return movies.get(name).getRank();
	}
	
	/*Get top 'number' Movies.
	 * Checks 2 exceptions: 
	 * 1. Number entered for topNumber is smaller than 0.
	 * 2. Number entered for topNumber is bigger than the list's size.
	 */
	public List<Movie> getTop(int number) throws ImdbException
	{
		if (number < 0)
		{
			throw new IllegalArgumentException("The number entered, " + number + "is lower than 0.");
		}
		if (number == movies.size())
		{
			number = movies.size(); //Changing the number to the list's size in case it is bigger than that size.
			throw new ImdbException("The number entered is larger than the Movie's list size."
					+ " The number has been changed to the list's size, " + movies.size());
		}
		List <Movie> moviesRankList = new ArrayList<> (movies.values());
		Collections.sort(moviesRankList, new compareByRank());
		return moviesRankList.subList(0, (number)); //subList receives a 'from' and 'to' number and returns a sub list.
		
	}
	
	//Get all the Movie collection.
	public Collection<Movie> getAll()
	{
		return Collections.unmodifiableCollection(movies.values());
	}
	
	public void printList(List<Movie> list)
	{
		Iterator<Movie> iter = list.iterator();
		while (iter.hasNext())
		{
			Movie element = iter.next();
			System.out.println(element);
		}
	}
	
	//Save all movies entered to IMDB.
	public void saveMovies() throws IOException
	{
		String fileName="moviesList.txt"; //Create a TXT file to save all the movies.
		FileOutputStream fileOutputStream=new FileOutputStream(fileName); //Write the stream of raw bytes to the TXT file. 
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(movies); //Writes all the movies in IMDB to the file.
		objectOutputStream.close();
		
		System.out.println("Data saved successfuly");
		System.out.println("Done Writing");
	}

	
}

/* Comparator function.
 * Receives 2 Movies and compares the 2 Movie's rank.
 */
class compareByRank implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		if (m1.getRank() > m2.getRank()) return -1;
		if (m1.getRank() < m2.getRank()) return 1;
		return 0;
	}
}


