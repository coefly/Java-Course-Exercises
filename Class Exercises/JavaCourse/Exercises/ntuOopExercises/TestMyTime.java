package ntuOopExercises;

public class TestMyTime {
	
	public static void main(String[]args)
	{
		//Defining 2 test times. 
		MyTime t1 = new MyTime(21, 38, 00);
		MyTime t2 = new MyTime(9, 00, 00);
		
		//Defining the print function.
		System.out.println("The first time is: " + t1 + "\n");
		System.out.println("The second time is: " + t2 + "\n");
		
		//Testing the setTime function on t2.
		t2.setTime(22, 58, 59);
		System.out.println("The time t2 after change of time is: " + t2 + "\n");
		
		//nextHour test.
		t2.nextHour();
		System.out.println("The next hour of t2 after change of time is: " + t2);
		
		//nextMinute test.
		t2.nextMinute();
		System.out.println("The next minute of t2 after change of time is: " + t2);
		
		//nextSecond test.
		t2.nextSecond();
		System.out.println("The next second of t2 after change of time is: " + t2);
		
		
	}

}
