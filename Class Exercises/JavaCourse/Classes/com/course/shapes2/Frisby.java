package com.course.shapes2;

import com.course.animals.Flyer;

public class Frisby extends Circle implements Flyer {

	public Frisby() {
		// TODO Auto-generated constructor stub
	}

	public Frisby(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	public Frisby(double radius, String color) {
		super(radius, color);
		// TODO Auto-generated constructor stub
	}

	//
	// Flyer implementation
	//
	
	@Override
	public void fly() {
		System.out.println("Frisbi flying");
		
	}

	@Override
	public void land() {
		System.out.println("Frisbi landing");
		
	}

}
