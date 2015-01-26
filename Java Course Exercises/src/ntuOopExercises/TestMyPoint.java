package ntuOopExercises;

public class TestMyPoint {

	public static void main(String[]args)
	{
		//Constructing of a 'no-argument' point.
		MyPoint p1 = new MyPoint(4, 5);
		MyPoint p2 = new MyPoint();
		MyPoint p3 = new MyPoint();
		MyPoint p4 = new MyPoint();
		
		//Printing out the 2 points constructed p1 and p2 using the Getters.
		System.out.println("The first point entered p1 is: (" + p1 + ")");
		System.out.println("The second point entered p2 is: (" + p2 + ")");
		System.out.println();
		
		//Printing out the 2 points constructed p3 and p4 using the Getters.
		System.out.println("The first point entered p3 is: (" + p3 + ")");
		System.out.println("The second point entered p3 is: (" + p3 + ")");
		System.out.println();
		
		//Setting Y of p3 using a setter.
		p3.setY(6); //After this line we are supposed to have p3 = (0, 6) instead of p3 = (0, 0).
		p4.setXY(1, 2); ////After this line we are supposed to have p4 = (1, 2) instead of p4 = (0, 0).
		
		//Printing out the 2 points constructed p3 and p4 after they have been changed using the seeters.
		System.out.println("The first point entered p3 is: (" + p3 + ")");
		System.out.println("The second point entered p3 is: (" + p4 + ")");
		System.out.println();
		
		//Printing the distance between p1 and a point (6, 7) by giving the values for the second point 'another'.
		System.out.print(p1.distance(6, 7));		
		System.out.println();
		
		//Printing the distance between p1 and p3 point by giving p1 and p3 as points.
		System.out.print(p1.distance(p3));
		System.out.println();
		
		
	}
}
