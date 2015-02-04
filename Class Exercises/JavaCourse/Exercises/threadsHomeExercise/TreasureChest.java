package threadsHomeExercise;

public class TreasureChest {
	
	private int coins = 0;
	
	//Constructing Treasure Chest with coins as integer.
	public TreasureChest(int coins)
	{
		this.coins = coins;
	}
	
	//Adding coins to the Treasure Chest.
	public synchronized void  addCoins(int amount) //Defined as 'Synchronized' to be able to sync with robCoin method.
	{
		this.coins += amount;
		this.notify(); //Notify the waiting method which is 'robCoin' that coins were added.
	}
	
	//Returns true if the Treasure Chest is empty.
	public boolean isEmpty()
	{
		if (this.coins == 0)
		{
			return true;
		}
		return false;
	}
	
	//Empties the Treasure Chest.
	public synchronized void robCoin() //Defined as 'Synchronized' to be able to sync with addCoind method.
	{
		while (this.coins == 0) //If there are no coins in the Treasure Chest, the method will wait until coins are added.
		{
			try
			{
				this.wait(); 
			} catch (InterruptedException e){
				//No real need to catch an exception.
			}
		}
		this.coins -= 1;
	}
	
	public String toString()
	{
		return "The treasure chest holds " + coins + "coins.";
	}

}