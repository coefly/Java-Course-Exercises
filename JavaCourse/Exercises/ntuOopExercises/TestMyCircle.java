package ntuOopExercises;

public class TestMyCircle {
	
	public static void main(String[]args)
	{
		MyCircle m1 = new MyCircle(3, 4, 6); //First constructor usage.
		MyPoint pCenter = new MyPoint(1, 2);
		MyCircle m2 = new MyCircle(pCenter, 5); //Second constructor usage.
		
		System.out.println("The radius for the first circle is: " + m1.getRadius() + "\n");
		System.out.println("The X coordinate of the center for circle m1 is: " + m1.getCenterX() + "\n");
		
		m2.setRadius(8); //Setting a new radius for m2. Radius will be 8 instead of 5.
		System.out.println("This is the radius of m2 after setting it: " + m2.getRadius() + "\n");
		
		System.out.println("The area for circle m1 is: " + m1.getArea() + "\n");
		
		System.out.println(m1.toString()); //Using toString to print m1.
	}

}
