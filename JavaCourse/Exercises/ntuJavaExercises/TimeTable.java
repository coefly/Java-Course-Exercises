package ntuJavaExercises;

public class TimeTable {
	
	public static void main(String[]args)
	{
		//Variables for defining columns and rows.
		int rows = 9;
		int cols = 9;
		
		//Defining 2 loops for incrementing the columns and rows.
		for(int row = 1; row <= rows; row++)
		{
			for(int col = 1; col <= cols; col++)
			{
				System.out.print(col * row + " ");
			}
			
			System.out.println();
		}
	}

}
