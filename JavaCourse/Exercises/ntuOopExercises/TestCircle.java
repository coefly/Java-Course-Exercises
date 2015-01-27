package ntuOopExercises;

import ntuOopExercisesPolymorphism.Circle;

public class TestCircle {
	
	public static void main(String[]args)
	{
		Circle c1 = new Circle(); //Create a new shape with the default values. Using Constructor number 1.
		Circle c2 = new Circle(2.0); //Using constructor number 2.
		Circle c3 = new Circle(3.0,"Grey", true); //Using constructor number 3.
	
	
		//Print out the 2 shapes.
		System.out.println("C1 is :" + c1.toString()); //Implicit call for toString.
		System.out.println("C2 is :" + c2.toString()); //Explicit call for toString.
		System.out.println("C3 is :" + c3.toString()); //Explicit call for toString.
	}

}
