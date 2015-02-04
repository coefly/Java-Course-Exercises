package ntuOopExercisesPolymorphism;

public class ClassTestOfShapesLoop
{
	
	public static void main(String[]args)
	{
		
		Shape[] arrOfShapes = new Shape[100];
		insertRandomShapesInArr(arrOfShapes);
		printGetArea(arrOfShapes);
	
	}
	
		
	public static void insertRandomShapesInArr (Shape[] arr) 
	{
		
		for(int i = 0; i < arr.length; i ++)
		{
			/*Creating a number between 0 and 2 (randShape) and then choosing between 3 different 
			shapes (cases) based on that number.*/
			int randShape = (int) ((Math.random() * 3));
			
			switch (randShape)
			{
			case 0: arr[i] = new Circle();
			break;
			
			case 1: arr[i] = new Rectangle();
			break;
			
			case 2: arr[i] = new Square();
			break;
			
			
			}
		}
	}
	
	//Print the shapes array.
	public static void printGetArea (Shape[] arr)
	{
		for(int i = 0; i < arr.length; i ++)
		{
			System.out.println(arr[i].getArea());
		}
	}
	
	
}	

	



