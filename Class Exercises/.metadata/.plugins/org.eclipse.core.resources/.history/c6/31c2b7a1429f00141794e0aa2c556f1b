package com.course.threads;

public class TestThreads {
	public static void main(String[] args) {
		HelloRunner r1 = new HelloRunner();
		// NEVER CALL 'RUN' DIRECTLY
		//r1.run();
		Thread t1 = new Thread(r1, "A");
		//t1.setDaemon(true);
		t1.start();
		
		HelloRunner r2 = new HelloRunner();
		Thread t2 = new Thread(r2, "B");
		t2.start();
		
		r1.pleaseDie();
		
		// 'MAIN' will wait until t1 and t2 will finish
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Back in main ");
	}

}

class HelloRunner implements Runnable
{
	private int i = 0;
	
	private volatile boolean pleaseStop = false;
	
	// This will be the 'main' of new threads
	public void run() {
		i = 0;
		while (!pleaseStop)
		{
			System.out.println(Thread.currentThread().getName() + 
						" Hello " + i++);
			if (i == 1000)
			{
				break;
			}
			
			Thread.yield();
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
		}
		System.out.println("Bye bye");
		// 
		// Clean up code
		//
	}
	
	public void pleaseDie()
	{
		pleaseStop = true;
	}
}
