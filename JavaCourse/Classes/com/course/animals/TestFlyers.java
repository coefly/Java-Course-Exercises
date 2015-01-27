package com.course.animals;

import com.course.author.Author;
import com.course.shapes2.Frisby;

public class TestFlyers {

	public static void main(String[] args) {
	//	fly(new Author("kuku", "hshus", 'm'));
		
		Flyer f = new Frisby();
		Flyer f2 = new Eagle();
	}
	
	public static void fly(Flyer f)
	{
		f.fly();
	}

}
