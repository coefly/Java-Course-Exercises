package Threads;

public class FirstThreadsExercise{
	
	public static void main(String[] args) {
		
		//Creating a new thread using the first way learnt (implements Thread)
		HelloWorldFirstWay run1 = new HelloWorldFirstWay();
		Thread t1 = new Thread(run1, "A");
		t1.start();
		//run1.dontRun();
		
		//Creating a new thread using the second way learnt (extends Thread)
		Thread t2 = new HelloWorldSecondWay("B");
		t2.start();
		
		//Constructing 2 new threads using the second way and passing through a thread name.
		Thread t3 = new HelloWorldSecondWay("Hello, Beautiful World");
		Thread t4 = new HelloWorldSecondWay("Goodbye, Cruel World");
		
		//Starting the 2 new threads.
		t3.start();
		t4.start();
		
		System.out.println("Back in Main.");
		
		
	}
}

	class HelloWorldFirstWay implements Runnable
	{
		boolean dontRun = false;
		private int i = 0;
		
		public void run()
		{
			i = 0;
			while(!dontRun)
			{
				System.out.println("Hello, Beautiful World " + Thread.currentThread().getName() + i++); //Print "Hello World" + the current thread name.
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if (i == 10)
					{
					break;
					}
			}
		}
		
		public void dontRun()
		{
			boolean dontRun = true;
		}
	}
	
	class HelloWorldSecondWay extends Thread
	{
		boolean dontRun = false;
		
		//Constructor for passing the name
		public HelloWorldSecondWay(String threadName)
		{
			super(threadName);
		}
		
		public void run()
		{
			
			while(!dontRun)
			{
				System.out.println("Hello World " + getName()); //Print "Hello World" + the current thread name.
				break;
			}
		}
		
		public void dontRun()
		{
			boolean dontRun = true;
		}
		
	}
	

	