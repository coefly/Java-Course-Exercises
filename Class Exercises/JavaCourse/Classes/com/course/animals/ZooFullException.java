package com.course.animals;

public class ZooFullException extends Exception 
{
	private int placesInTheZoo;
	
	public ZooFullException(int places) {
		this.placesInTheZoo = places;
	}
	
	public int getPlacesInTheZoo() {
		return placesInTheZoo;
	}

}
