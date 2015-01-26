package ntuOopExercises;

import ntuOopExercisesPolymorphism.Rectangle;

public class TestRectangle {
	
	public static void main(String[]args)
	{
		Rectangle r1 = new Rectangle(); //Create a new shape with the default values. Using Constructor number 1.
		Rectangle r2 = new Rectangle(2.0, 3.0); //Using constructor number 2.
		Rectangle r3 = new Rectangle(3.0, 4.0, "Grey", true); //Using constructor number 3.
	
	
		//Print out the 2 shapes.
		System.out.println("R1 is :" + r1.toString()); //Implicit call for toString.
		System.out.println("R2 is :" + r2.toString()); //Explicit call for toString.
		System.out.println("R3 is :" + r3.toString()); //Explicit call for toString.
	}

}
