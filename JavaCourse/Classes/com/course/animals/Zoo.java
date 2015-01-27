package com.course.animals;

public class Zoo {
//	private Dog[] dogs;
//	private Dolphin[] dogs;
	private Animal[] animals = new Animal[100];
	private int numOfAnimals = 0;
	
	public void addAnimal(Animal a)
	{
		animals[numOfAnimals++] = a;
	}
	
	// lunch time - feed animals
	public void feedAnimals()
	{
		for (int i = 0; i < numOfAnimals; i++) {
			// Never downcast without instanceof!!!
//			if (animals[i] instanceof Dog)
//			{
//				// down cast
//				// Create a new REFERENCE to the SAME DOG
//				Dog d = (Dog)animals[i];
//				d.bark();
//			}
			
			animals[i].eat();
			
		}
	}

}
