package ntuOopExercises;

public class TestMyTriangle {
	
	public static void main(String[]args)
	{
		MyPoint v1 = new MyPoint(1, 1);
		MyPoint v2 = new MyPoint(2, 2);
		MyPoint v3 = new MyPoint(3, 3);
		MyTriangle t1 = new MyTriangle(0, 0, 1, 1, 2, 2);
		MyTriangle t2 = new MyTriangle(v1, v2, v3);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}

}
