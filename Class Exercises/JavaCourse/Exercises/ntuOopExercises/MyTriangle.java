package ntuOopExercises;

public class MyTriangle {
	
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	MyTriangle( int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}
	
	MyTriangle( MyPoint v1, MyPoint v2, MyPoint v3)
	{
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public double getPerimeter()
	{
		double face1 = v1.distance(v2);
		double face2 = v2.distance(v3);
		double face3 = v3.distance(v1);
		
		double perimeter = face1 + face2 + face3;
		return perimeter;
	}
	
	
	
	public String printType()
	{
		double face1 = v1.distance(v2);
		double face2 = v2.distance(v3);
		double face3 = v3.distance(v1);
		String type = "Other";
		
		if (face1 == face2 && face2 == face3)
			type = "equilateral";
		else if(face1 == face2 && face2 != face3 || face3 == face1 && face1 != face2 || 
				face2 == face3 && face2 != face1)
			type = "isosceles";
		else if(face1 != face2 && face2 != face3 && face3 != face1)
			type = "scalene";

		return type;
	}
	
	
	public String toString()
	{
		return "Triangle @ " + v1 + ", " + v2 + ", " + v3 + "of Type = " + printType();
	}
		
}
