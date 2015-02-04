package javaArraysLab;

public class Exercise1 {
	
	public static void main(String[]args)
	{
		int[] numArray = new int [100];
		int sum = 0;
		double avg = 0;
		
		
		for (int i = 1; i < numArray.length; i++)
		{
			numArray[i] = (int) (Math.random()*100);
			sum = sum + numArray[i];
			
		/*	for (int j = 1; j <=numArray.length; j++)
			{
				sum = sum + numArray[j]; 
			}*/
		}
		
		avg = sum/100;
		
		System.out.println("The sum is: " + sum + "\n");
		System.out.println("The average of the array is: " + avg);
		
	}

}
