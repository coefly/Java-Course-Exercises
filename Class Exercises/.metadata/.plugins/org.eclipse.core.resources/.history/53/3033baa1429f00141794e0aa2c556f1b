package com.course.threads;

public class TestThreads2 {
	public static void main(String[] args) {
		Thread t1 = new HelloRunnerThread();
		t1.start();
		
		Thread t2 = new HelloRunnerThread();
		t2.start();
		
		// stop is deprecated! use a nicer way instead
		// t1.stop
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();

		System.out.println("Back in main ");
	}

}

class HelloRunnerThread extends Thread
{
	private int i = 0;
	
	// This will be the 'main' of new threads
	public void run() {
		i = 0;
		while (true)
		{
			System.out.println(Thread.currentThread().getName() + 
						" Hello " + i++);
			if (i == 50)
			{
				break;
			}
			
		}
		System.out.println("Bye bye");
	}
}
