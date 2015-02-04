package com.course.threads;

public class Stack {
	private char[] data = new char[100];
	private int index = 0;

	//private final Object locker = new Object();
	//private Object locker2 = new Object();

	
	// A synchronized method is a method that all of its content
	// is locked on 'this'
	public synchronized void push(char c) {
		data[index] = c;
		index++;
	}

	public char pop() {
		
		synchronized (this) {
			index--;
			return data[index];
		}
	}
	
	

}
