package parkingHomeworkExercise;

public class Truck extends Veichle{
	
	private int weight;
	
	//no-arg Constructor.
	public Truck()
	{
		
	}
	
	//Constructor passing values.
	public Truck(String color, int max_velocity,int model, int weight)
	{
		super(color, max_velocity, model);
		this.weight = weight;
		
	}
	
	//Get Weight method.
	public int getWeight()
	{
		return weight;
	}
	
	//Override the toString class of super class.
	@Override
	public String toString()
	{
		return "Type: " + getClass().getSimpleName() + ", Weight: " + weight + " " + super.toString();
	}

}
