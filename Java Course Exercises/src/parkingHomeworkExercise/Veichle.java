package parkingHomeworkExercise;

public class Veichle extends Transport{
	
	private int model;
	
	//no-arg Constructor.
	public Veichle()
	{
		
	}
	
	//Constructor passing values color and max velocity.
		public Veichle(String color, int max_velocity) 
		{
			super(color, max_velocity);
		}

	
	//Constructor passing values color, max velocity and model.
	public Veichle(String color, int max_velocity, int model) 
	{
		super(color, max_velocity);
		this.model = model;
	}
	
	public void setModel(int model)
	{
		this.model = model;
	}

	//Override the toString method of super class.
	@Override
	public String toString()
	{
		return "Model: " + model + " " + super.toString();
	}
}
