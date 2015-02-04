package ntuOopExercises;
public class OldCircle {           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   //
   // Constructors
   //
   
   // 1st constructor, which sets both radius and color to default
   public OldCircle() {
      radius = 1.0;
      color = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public OldCircle(double r) {
      radius = r;
      color = "red";
   }
   
   //3rd Constructor with given radius and color
   public OldCircle(double r, String color)
   {
	   radius = r;
	   this.color = color;
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
   
   public void setColor(String color)
   {
	   this.color = color;
   }
   
   public String toString()
   {
	   return "Circle: radius = " + radius + " color = " + color;
   }
   
}