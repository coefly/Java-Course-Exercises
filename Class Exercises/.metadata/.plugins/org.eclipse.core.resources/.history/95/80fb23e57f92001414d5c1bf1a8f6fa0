package com.course.exceptions;

public class TestFlow {
	public static void main(String[] args) {
		System.out.println("In main");
		try { 
			f1();
		} 
//		catch (ArithmeticException e){
//		}
//		catch (NumberFormatException e){
//		}
		catch (Exception e) {
//			// DO NOT DO THIS!!!
//			if (e instanceof ArithmeticException)
//			{}
//			else if (e instanceof NumberFormatException)
//			{}
//			else
//			{}
			e.printStackTrace();
		}
		
		System.out.println("Back in main");

	}

	public static void f1() {
		System.out.println("In f1");
		f2();
		System.out.println("Back in f1");
	}

	public static void f2() {
		System.out.println("In f2");
		f3();
		System.out.println("Back in f2");
	}

	public static void f3() {
		System.out.println("In f3");
		int i = 5 / 0;
		System.out.println("Back in f3");
	}
}
