package ntuOopExercises;

import ntuOopExercisesPolymorphism.Square;

public class TestSquare {
	
	public static void main(String[]args)
	{
		Square sq1 = new Square(); //Create a new shape with the default values. Using Constructor number 1.
		Square sq2 = new Square(5.0); //Using constructor number 2.
		Square sq3 = new Square(6.0,"Pink", false); //Using constructor number 3.
	
	
		//Print out the 2 shapes.
		System.out.println("Square 1 is :" + sq1.toString());
		System.out.println("Sqaure 2 is :" + sq2.toString());
		System.out.println("Square 3 is :" + sq3.toString());
	}

}
