package com.course.misc;
public class HarmonicSum 
{ 
	public static void main (String[] args) 
	{
		int maxDenominator = 1000000;
		double sumL2R = 0.0;    // sum from left-to-right
		double sumR2L = 0.0;    // sum from right-to-left
   
		  // for-loop for summing from left-to-right
		  for (int denominator = 1; denominator <= maxDenominator; ++denominator) 
		  {
		      sumL2R += 1D/denominator;
		  }
      
		  // for-loop for summing from right-to-left
		  for (int denominator = maxDenominator; denominator > 0; denominator--)
		  {
		      sumR2L += 1D/denominator;
		  }  
		  
		  System.out.println("sum1: " + sumL2R);
		  System.out.println("sum2: " + sumR2L);
		  System.out.println("Diff: " + Math.abs(sumL2R - sumR2L));
	}
}