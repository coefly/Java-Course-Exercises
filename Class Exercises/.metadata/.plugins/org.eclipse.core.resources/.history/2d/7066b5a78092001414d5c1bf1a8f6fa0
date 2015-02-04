package com.course.animals;

public class Dolphin extends Animal
{
	private int snapirLength = 10;
	
	public Dolphin()
	{
		// First line of constructor MUST BE to call the super
		// constructor and pass the values he needs
		super("dolf", 5);
	}
	
	public Dolphin(String name, int age, int snapirLength)
	{
		super(name, age);
		this.snapirLength = snapirLength;
	}
	
	// This function overrides the superclass implementation of the same 
	// function
	public String toString() {
		// First call the super implementation and then add something
		return super.toString() +
					" Snapir: " + snapirLength;
	}
	
	@Override
	public void eat() {
		System.out.println("Dolphin eating");
	}
}
