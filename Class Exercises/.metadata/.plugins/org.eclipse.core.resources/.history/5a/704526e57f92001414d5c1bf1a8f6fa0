package com.course.exceptions;

import java.io.IOException;

public class TestFlowDemonstrateDifferenceBetweenRuntimeExceptionsAndOthers {
	public static void main(String[] args) {
		System.out.println("In main");
		try {
			f1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Back in main");
	}

	public static void f1() throws IOException {
		System.out.println("In f1");
		f2(); 
		System.out.println("Back in f1");
	}

	public static void f2() throws IOException{
		System.out.println("In f2");
		f3();
		System.out.println("Back in f2");
	}

	public static void f3() throws IOException{
		System.out.println("In f3");
		throw new IOException("This is very very bad!");
		//System.out.println("Back in f3");
	}

}
