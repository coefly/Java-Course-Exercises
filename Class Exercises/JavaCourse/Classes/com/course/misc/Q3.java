package com.course.misc;
public class Q3 
{
	// This code is to eliminate duplications
	public static void main(String[] args) 
	{
		int[] arr = new int[10];
		int[] uniquearr = new int[arr.length];
		
		chooseRanNum(arr);
		int newArrayLength = copyUniqueValues(arr,uniquearr);
		PrintArr(arr);
		uniquearr = shrinkArray(uniquearr, newArrayLength);
		PrintArr(uniquearr);
	}
	
	// Fill the arr with random numbers
	public static void chooseRanNum(int[] arr) 
	{
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*11);
		}
	}
	
	public static int copyUniqueValues(int[] arr,
			int[] uniquearr) 
	{
		int counter = 0;
		boolean needToCopy = false;
		for (int j=0;j<arr.length;j++)
		{	
			for (int i= 0 ;i<arr.length;i++)
			{
				if (j!=i)
				{
					if (arr[j]==arr[i])
					{
						needToCopy = false;
						break; 
					}
					else 
					{
						needToCopy = true;
					}
				}
			}
			
			if (needToCopy)
			{
				uniquearr[counter] = arr[j];
				counter++;
				needToCopy = false;
			}
		}
		return counter;
	}
	
	public static void PrintArr(int[] arr) 
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
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
