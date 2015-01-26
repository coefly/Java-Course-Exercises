package com.course.animals;

public class Dog extends Animal{

	public Dog() {
		super("Humi", 10);
	}
	
	public void bark()
	{
		System.out.println("Dog barking. Hau hau hau");
	}

	@Override
	public void eat() {
		bark();
		System.out.println("Dog eating");
	}
}
