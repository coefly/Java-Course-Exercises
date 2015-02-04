package ntuOopExercises;

public class TestShape {
	
	public static void main(String[]args)
	{
	
		OldShape s1 = new OldShape(); //Create a new shape with the default values.
		OldShape s2 = new OldShape("white", false);
	
	
		//Print out the 2 shapes.
		System.out.println("S1 is :" + s1.toString()); //Implicit call for toString.
		System.out.println("S2 is :" + s2.toString()); //Explicit call for toString.
		
	}

}
