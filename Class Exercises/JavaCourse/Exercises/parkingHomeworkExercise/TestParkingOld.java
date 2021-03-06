package parkingHomeworkExercise;

public class TestParkingOld {
	
	//Filling up the parking with veichles.
	public static void main(String[]args)
	{
	
	//Calling the getParking method to match with the Singleton approach. Only 1 Parking can be created.
	ParkingOld p1 = ParkingOld.getParking();
	
	p1.insertVeichle(new Bike("green", 16, 5));
	p1.insertVeichle(new Car("black", 16));
	p1.insertVeichle(new Truck("yellow", 16, 1980, 10));
	p1.insertVeichle(new Car("green", 16));
	p1.insertVeichle(new Truck("white", 16, 2014, 16));
	
	//Trying to insert another veichle which should not work.
	p1.insertVeichle(new Bike("pink", 16));
	
	//Removing a veichle from Parking.
	p1.removeVeichle(2);
	
	//Testing the remove method once more to receive the message for "no veichle parking".
	p1.removeVeichle(2);
	
	//Search a veichle by color.
	//Since there are 2 green veichles we should see the first one which is a Bike.
	System.out.println("\n" + "The number of veichles in the chosen color is: " + p1.searchVeichleByColor("green"));
	
	//Count and return how many veichles there are in the parking. Veichles with more than 2 wheels.
	System.out.println("\n" + "The number of veichles with more than 2 wheels is: " +  p1.countVeichlesWithMoreThan2Wheels()); //We are getting 3 since we moved out one Truck from Parking.
	
	//Count and return how many Cars there are in the parking (Veichles instanceof Car).
	System.out.println("\n" + "The number of Cars in the Parking is: " + p1.countCars()); //We are getting 2 as there are 2 Cars in Parking.
	
	//Count and return num of Trucks of a certain color and weight.
	try
	{
	System.out.println("\n" + "The number of Trucks in the Parking meeting the requests is: " 
	+ p1.countTrucksOfColorAndWeight("white", 40, 10));
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("************************************************");
		  System.out.println("Caught Illegal arguments inserted: "
                   +  e.getMessage());
                    
	}
	
	//Count and return num of Bikes with number of gears between Gear1 and Gear2.
	System.out.println("\n" + "The number of Bikes  meeting the requests is: " + p1.countBikeWithGear(2, 6));
	
	//Search all veichles with defined speed and return all of them.
	
	System.out.println("\n" + "The veichles with the defined speed are: ");
	for (int i = 0; i < p1.searchAndReturnVeichlesBySpeed(16).length; i++) 
	{
		System.out.println(p1.searchAndReturnVeichlesBySpeed(16)[i]);
	}
		
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	//
	//--------RANDOM METHODS TO POPULATE THE VEICHLES ARRAY --> Just for fun :-) ---------
	//
	
	//Create random veichles in Veichles array --> Up to 7 veichles.
	public static void insertRandomVeichleInArr (Transport[] arr) 
	{
		
		for(int i = 0; i < (arr.length); i ++)
		{
			/*Creating a number between 0 and 2 (randVeichle) and then choosing between 3 different 
			Veichle (cases) based on that number.*/
			int randVeichle = (int) ((Math.random() * 3));
			
			switch (randVeichle)
			{
			case 0: arr[i] = new Car(randomColorGenerate(), randomMaxVelocity(), randomModel());
			break;
			case 1: arr[i] = new Truck(randomColorGenerate(), randomMaxVelocity(), randomModel(), randomWeightGenerate());
			break;
			case 2: arr[i] = new Bike(randomColorGenerate(), randomMaxVelocity(), randomGear());
			break;
			}
		}
	}
	
	//Generate random weights for Trucks.
	public static int randomWeightGenerate ()
	{
		int Weight = (int )((Math.random() * 1000));
		return Weight;
	}
	
	//Choose between 3 colors for veichles randomly.
	public static String randomColorGenerate ()
	{
		String randColor = null;
		int rand = (int) ((Math.random() * 3));
		
		switch (rand)
		{
		case 0: randColor = "Blue";
		break;
		case 1: randColor = "Red";
		break;
		case 2: randColor = "Green";
		break;
		}
		
		return randColor;
	}
	
	//Generate random Velocity and return Velocity.
	public static int randomMaxVelocity()
	{
		int Velocity = (int) ((Math.random() * 100)); // Random velocity between 0 to 100.
		return Velocity;
	}
	
	//Generate random Model.
	public static int randomModel()
	{
		int Model = (int) ((Math.random() * 1000) + 1000);
		return Model;
	}
	
	//Generate random gear.
	public static int randomGear()
	{
		int Gear = (int) ((Math.random() * 3));
		return Gear;
	}
	
	
	

}
