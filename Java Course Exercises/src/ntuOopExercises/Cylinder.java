package ntuOopExercises;

import ntuOopExercisesPolymorphism.Circle;

public class Cylinder extends Circle {  //save as "Cylinder.java"
   private double height;  // private variable
   
   // Constructor with default color, radius and height
   public Cylinder() {
      super();        // call superclass no-arg constructor Circle()
      height = 1.0; 
   }
   // Constructor with default radius, color but given height
   public Cylinder(double height) {
      super();        // call superclass no-arg constructor Circle()
      this.height = height;
   }
   // Constructor with default color, but given radius, height
   public Cylinder(double radius, double height) {
      super(radius);  // call superclass constructor Circle(r)
      this.height = height;
   }
   
   // A public method for retrieving the height
   public double getHeight() {
      return height; 
   }
  
   // A public method for computing the volume of cylinder
   //  use superclass method getArea() to get the base area
   public double getVolume() {
      return super.getArea()*height; //Added 'super' so to inherit getArea from Circle class.
   }
   
   public double getArea()
   {
	   return super.getRadius()*2*Math.PI*this.height + 2*super.getArea(); //Using the getArea from Circle class.
   }
   
   // My toString function using the new getArea func for calculating the Cylinder's area.
   /*public String toString()
   {
 	  return "Cylinder:"
 	            + " radius=" + getRadius()
 	            + " height=" + getHeight()
 	            + " base area=" + super.getArea()
 	            + " volume=" + getVolume()
 	            + " Cylinder area=" + getArea();
   }*/
   
   @Override //Using the toString function of Circle class + new Cylidner toString variables.
   public String toString() {      // in Cylinder class
      return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
             + " height=" + height + " Cylinder area=" + getArea();
   }
}