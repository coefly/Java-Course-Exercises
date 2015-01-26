package ntuJavaExercises;

public class SquareBoard {

	public static void main(String[]args)
	{
		//Defining row and line variables.
		int rows = 5;
		int lines = 5;
		
		//Defining 2 for loops to print the square board.
		//First for loop will 'run' on all rows (first row, second row, ...).
		//Second for loop will 'run' on all lines (first line, second line, ...).
		for(int row = 1; row <= rows; row++)
		{
			for(int line = 1; line <= lines; line++)
			{
				System.out.print("# ");
			}
			
			System.out.println();
		}
				
	}
}
