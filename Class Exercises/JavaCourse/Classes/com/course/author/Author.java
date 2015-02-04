package com.course.author;

public class Author {
	//
	// Attributes
	//
	private String name = "--undefined--";
	private String email = "--undefined--";
	private char gender = 'U';
	
	public Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		if (gender == 'm' || gender == 'M' || 
			gender == 'f' || gender == 'F')
		{
			this.gender = gender;
		}
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		// TODO: check that the email is valid
		this.email = email;
	}
	
	public String toString()
	{
		return name + " (" + gender + ") at " + email;
	}
	
}
