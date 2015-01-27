package com.course.misc;
import java.lang.reflect.Array;


public class Loops2 
{
	public static void main(String[] args) 
	{
		triangle1();
		triangle2();
		Pascaletriangle();
		Pascaletriangle1();
	}
	
	

	static void triangle1()
	{
		for (int x=0; x<6;x++)
		{
			for(int i=0; i<11; i++)
			{
				if(i<x||i+x>=11)
				{
					System.out.print(" ");
				}	
				else
				{
					System.out.print("#");	
				}
			
			}
			System.out.println("");

		}
	}
	
	static void triangle2()
	{
		for(int x=5;x>=0;x--)
		{
			for(int i=0;i<11;i++)
			{
				if(i>=x && i<=10-x)
				{
					System.out.print("#");	
				}	
				
				else
				{					
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}

	static void Pascaletriangle()
	{
		
		int[][] arr=new int [11][11] ;
		int i;
		int x;
		int num1=10;
		int num2=num1;
		
		for(i=0;i<=num1;i++)
		{
			for(x=0;x<=num2;x++)
			{
				if(i==0 && x==num2/2)
				{
					arr[i][num2/2]=1;
				}
				else
				{
					arr[i][x]=0;
				}
				
				if (i>0 && (x!=0 && x<num2))
				{
					arr[i][x]=arr[i-1][x+1]+arr[i-1][x-1];
				}
				
				if(arr[i][x]==0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(arr[i][x]);
				}

			}
			System.out.println("");
		}
	}

	static void Pascaletriangle1()
	{
		
		int[][] arr=new int [11][11] ;
		int i;
		int x;
		int num1=10;
		
		for (i=0;i<=10;i++)
		{
			for (x=0;x<=10;x++)
			{
				
			}
		}
		
	}



}	
	

