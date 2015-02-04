package ntuOopExercisesPolymorphism;
public class Circle extends Shape {           // Inherits from Shape Class.
	
   // private instance variable, not accessible from outside this class
   protected double radius = 1;
      
   //
   // Constructors
   //
   
   // 1st constructor, which sets radius to default.
   public Circle() 
   {
       
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double r) {
      radius = r;
   
   }
   
   //3rd Constructor with given radius and color
   public Circle(double r, String color, boolean filled)
   {
	   super(color, filled);
	   radius = r;
	   
   }
   
   //
   // Getters
   //
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   // A public methods for computing the perimeter.
   public double getPerimeter()
   {
	   return 2*Math.PI*radius;
   }
   
   //A public method to get the circle color
   public String getColor()
   {
	   return color;
   }
   
   //
   // Setters
   //
   
   // Setters for setting a custom radius and color after the circles creation
   public void setRadius(double radius)
   {
	   this.radius = radius;
   }
   
   @Override
   public String toString() // Overrides toString method found in Shape class.
   {
	   return "A Circle with radius= " + radius + " which is a subclass of " + super.toString() + "\n";
   }
   
}