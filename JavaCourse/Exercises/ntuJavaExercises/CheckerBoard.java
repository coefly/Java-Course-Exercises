package ntuJavaExercises;

public class CheckerBoard {
	
	public static void main(String[]args)
	{
		//Defining row and line variables.
				int rows = 7;
				int lines = 7;
				int line = 1;
				
				//Defining 2 for loops to print the square board.
				//First for loop will 'run' on all rows (first row, second row, ...).
				//Second for loop will 'run' on all lines (first line, second line, ...).
				for(int row = 1; row <= rows; row++)
				{
					for(line = 1; line <= lines; line++)
					{
						System.out.print("# ");	
					}
					
					System.out.println();
					if(row % 2 != 0)
						System.out.print(" ");
					
					
				}
	}

}
