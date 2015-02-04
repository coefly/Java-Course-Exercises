package com.course.tests;
import java.util.Arrays;


public class TestMAtrix {
	
	public static void main(String[] args) {
		int[][] matrix = new int[10][10];
		
		// fill the array with luach hakefel
		fillWithLuachHekefel(matrix);
		
		// print the array
		//printTheMatrix(matrix);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	
	public static void fillWithLuachHekefel(int[][] matrix)
	{
		// fill the array with luach hakefel
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (i + 1) * (j + 1);
			}
		}
				
	}
	
	public static void printTheMatrix(int[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("%4d", matrix[i][j]);
			}
			// new line
			System.out.println();
		}
	}
	
	
	
}
