package ntuOopExercises;
public class TestOldCircle {        // save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare and allocate an instance of class Circle called c1
      //  with default radius and color
      OldCircle c1 = new OldCircle();
      // Use the dot operator to invoke methods of instance c1.
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
   
      // Declare and allocate an instance of class circle called c2
      //  with the given radius and default color
      OldCircle c2 = new OldCircle(2.0);
      // Use the dot operator to invoke methods of instance c2.
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      
      // Declare and allocate an instance of class circle called c3
      // With the given radius and color
      OldCircle c3 = new OldCircle(10, "pink");
      System.out.println("The circle has a radius of " + c3.getRadius() + " and an area of " + c3.getArea() + " its color is " + c3.getColor());
      
      
      //Modify C4 to test the setter methods
      OldCircle c4 = new OldCircle(9, "Black");
      c4.setColor("Grey"); //explicitly setting a color
      c4.setRadius(11.7); //explicitly setting a radius
      System.out.println("Circle C4 radius is: " + c4.getRadius() + " area is " + c4.getArea() + " color is " + c4.getColor());
      
      //Calling the toString method
      OldCircle c5 = new OldCircle(5.67);
      System.out.println(c5.toString()); //Explicit calling toString
      System.out.println(c4); //Implicit calling toString
   }
}