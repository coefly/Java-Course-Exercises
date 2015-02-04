package ntuOopExercises;

public class MyTime {
	
	private int hour = 00;
	private int minute = 00;
	private int second = 00;

	MyTime(int hour, int minute, int second)
	{
		if(hour <= 23 && hour >= 0 && minute <= 59 && minute >= 0 && second <= 59 && second >= 0)
			{
				this.hour = hour;
				this.minute = minute;
				this.second = second;
			}
			else 
			System.out.println("Invalid hour, minute, or second!");
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
	}
	
	public void setHour(int hour)
	{
		if(hour <= 23 && hour >= 0)
			this.hour = hour;
	}
	
	public void setMinute(int minute)
	{
		if(minute <= 59 && minute >= 0)
			this.minute = minute;
	}
	
	public void setSecond(int second)
	{
		if(second <= 59 && second >= 0)
			this.second = second;
	}
	
	public void setTime(int hour, int minute, int second)
	{
		if(hour <= 23 && hour >= 0 && minute <= 59 && minute >= 0 && second <= 59 && second >= 0)
		{
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		else 
		System.out.println("Invalid hour, minute, or second!");
	}
	
	public MyTime nextHour()
	{
		if (this.hour <= 22)
			hour++;
		
		return new MyTime(this.hour, this.minute, this.second);
	}
	
	public MyTime nextMinute()
	{
		minute++;
		if(minute == 59 && hour <= 22)
			{
			minute = 0;
			hour++;
			}
		
		return new MyTime(this.hour, this.minute, this.second);
	}
	
	public MyTime nextSecond()
	{
			second++;
			if(second == 60 && minute <= 58)
				{
				second = 00;
				minute++;
				}
			else if(second == 60 && minute == 59 && hour == 23)
			{
				second = 00;
				minute = 00;
				hour = 00;
			}
			else if(second == 60 && minute == 59)
			{
				second = 00;
				minute = 00;
				hour++;
			}
			
		
		return new MyTime(this.hour, this.minute, this.second);
	}
	
	public String toString()
	{
		String time = "HH:MM:SS";
		if(hour <= 9 && minute <= 9 && second <= 9)
			time =  "The time is: 0" + hour + ":0" + minute + ":0" + second;
		else if(minute <= 9 && second <= 9)
			time =  "The time is: " + hour + ":0" + minute + ":0" + second;
		else if(second <= 9)
			time =  "The time is: " + hour + ":" + minute + ":0" + second;
		else
			time = "The time is: " + hour + ":" + minute + ":" + second;
		
		return time;
	}
	
}
