package ntuOopExercises;

public class Author {
	
	//
	// Variables
	//
	
	private String name;
	private String email;
	private char gender = 'U';
	
	
	//
	// Constructor
	//
	
	public Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		
		if (gender == 'M'|| gender == 'F' || gender == 'm'|| gender == 'f')
		{
			this.gender = gender;
		}
	}
	
	//
	// Getters
	//
	
	// Get for getting name
	public String getName ()
	{
		return name;
	}
	// Get for getting email
	public String getEmail ()
	{
		return email;
	}
	
	//
	// Setters
	//
	
	// Setting the email
	public void setEmail(String email)
	{
		this.email = email;
	}
	// Setting the gender
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	//
	// toString method
	//
	
	public String toString()
	{
		return "Author: Name = " + name + " Email = " + email + " Gender = " + gender;
	}
}
