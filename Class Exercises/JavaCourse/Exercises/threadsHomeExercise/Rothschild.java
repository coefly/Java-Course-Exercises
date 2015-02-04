package threadsHomeExercise;

public class Rothschild extends Thread{
	
	TreasureChest treasure;
	
	public Rothschild(TreasureChest chest)
	{
		super("Ro");
		this.treasure = chest;
	}
	
	public void run()
	{
		while(true)
		{	
			treasure.addCoins((int) (Math.random() * 100) + 1);
			try
			{
				System.out.println("Rothschild says: " + treasure.toString()); //Return the amount of coins currently in the treasure.
				Thread.sleep(3000);
			} catch (InterruptedException e)
			{
				//No real need to catch an exception.
			}
		}	
	}
}

