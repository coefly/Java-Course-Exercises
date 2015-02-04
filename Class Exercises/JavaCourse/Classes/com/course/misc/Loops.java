package com.course.misc;

public class Loops {

	public static void main(String[] args) {
		int [] arr = new int [10];
		int [] arr2 = new int [10];
		boolean notExists = true;
		

		// fill the array with random values
		for (int j = 0; j < arr.length; j++) {
			arr[j] = (int)((Math.random()*(10) + 1));
		}

		// print the array
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+",");
		}

		int indexInTheNewArray = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr2.length; k++) {
				if(arr[j]==arr2[k])
				{
					notExists = false;
				}
			}
			if(notExists)
			{
				arr2[indexInTheNewArray++]=arr[j];
			}
			notExists = true;
		}
		
		arr2 = shrinkArray(arr2, indexInTheNewArray);
		
		// Print the final array
		System.out.println("");
		for (int j = 0; j < arr2.length; j++) {
			System.out.print(arr2[j]+",");

		}


	}

	public static int[] shrinkArray(int[] arr, int newSize)
	{
		// create the new array
		int[] newArray = new int[newSize];
		
		// copy values
		System.arraycopy(arr, 0, newArray, 0, newSize);
		
		// return the new array
		return newArray;
	}
}
