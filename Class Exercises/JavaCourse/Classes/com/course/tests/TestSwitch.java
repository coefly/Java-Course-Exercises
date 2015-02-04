package com.course.tests;

public class TestSwitch
{
	public static void main(String[] args) 
	{
		int num = (int)(Math.random() * 3);
		
		switch (num)
		{
		case 0:
			System.out.println("ZERO");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 1: 	
			System.out.println("ONE");
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}

}
