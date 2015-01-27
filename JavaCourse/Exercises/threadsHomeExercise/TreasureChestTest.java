package threadsHomeExercise;

public class TreasureChestTest {
	
	public static void main(String[] args) 
	{
		
		TreasureChest chest = new TreasureChest(100);
		
	    //Creation of Rotschild.
		new Rothschild(chest).start();
		
		//Creation of 40 robbers.
		Robber[] robbers = new Robber[40];
		for (int i = 0; i < robbers.length; i++) 
		{
			robbers[i] = new Robber(chest,"" + i);
			robbers[i].start();
		}
		
	}

}
