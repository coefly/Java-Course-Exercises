package com.course.animals;

public class TestZoo {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Cat());
		//zoo.addAnimal(new Animal("ani", 9));
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Zebra());
		zoo.addAnimal(new Hedgehog());
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Dolphin());
		zoo.addAnimal(new Antilop());
		zoo.addAnimal(new Ant());
		zoo.addAnimal(new Hamster());
		
		zoo.feedAnimals();
	}
}
