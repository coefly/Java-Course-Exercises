package iO;
import java.io.*;
import java.util.*;

public class Calculator {
	
	public static void main(String[] args) throws IOException {
	
		while(true)
		{
		// System.in - keyboard
		// InputStreamReader - converts bytes to chars
		
		System.out.println("Please enter a number..");
		Scanner sc1 = new Scanner(new InputStreamReader(System.in));
		int num1 = sc1.nextInt();
		
		System.out.println("Please enter an Operator..");
		Scanner operator = new Scanner(new InputStreamReader(System.in));
		String oper = operator.nextLine();
		
		System.out.println("Please enter another number..");
		Scanner sc2 = new Scanner(new InputStreamReader(System.in));
		int num2 = sc2.nextInt();
		
		
		
		System.out.println("The solution is: ");
		try{
		System.out.println(operation(oper, num1, num2));
		}catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		}	
	}
	
	public static double operation(String operator, int num1, int num2) throws IllegalArgumentException
	{
		double solution = 0;
		if (operator.equals("-"))
		{
			solution = num1 - num2;
		}
		if (operator.equals("+"))
		{
			solution = num1 + num2;
		}
		if (operator.equals("*"))
		{
			solution = num1 * num2;
		}
		if (operator.equals("/"))
		{
			if (num2 == 0)
			{
				throw new IllegalArgumentException("No dividing in ZERO is allowed ;-)");
			}
			solution = num1 / num2;
			
			
		}
		
		return solution;
	}
}
