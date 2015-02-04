package javaArraysLab;

public class Exercise2 {
	
	public static void main(String[]args)
	{
		int[] arr = new int [50];
		int index = 0;
		int high = 0;
		
		//Array definition with random numbers.
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (int) (Math.random()*100);
			if(high <= arr[i])
			{
			high = arr[i];
			index = i;
			}
		}
		
		/*//Checking for the highest number and the index for the highest number.
		for (int j = 0; j < (arr.length - 1); j++) //We run until (arr.length -1) so to avoid the index getting bigger than the array.
		{
			if(high >= arr[j])
				{
				high = arr[j];
				index = j;
				}

				else if(arr[j] <= arr[j + 1])
						{
						high = arr[j + 1];
						index = j + 1;
						}						
		}*/
		
		//Printing the array.
		System.out.println("The array is: " + "\n");
		for (int k = 0; k < arr.length; k++)
		{
			System.out.print(" " + arr[k] + " ");
		}
		
		//Printing the highest number and its index.
		System.out.println("\n" + "The highest number in the array is: " + high + "\n");
		System.out.println("The index for the highest number is: " + index);
		
		
		
	}

}
