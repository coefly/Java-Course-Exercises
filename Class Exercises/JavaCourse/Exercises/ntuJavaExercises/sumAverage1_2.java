package ntuJavaExercises;

public class sumAverage1_2 {
	
	public static void main(String[] args)
	{
		int sum = 0;
		double avg = 0;
		int upperval = 100;
		int lowerval = 1;
		
		for(int i = lowerval; i <= upperval; i++)
		{
			sum = sum + i;
			avg = sum/100;
		}
		
		System.out.println("The sum is: " + sum + " and the average is: " + avg);
	}
}
