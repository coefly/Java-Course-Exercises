package com.course.threads;

public class TestCurrentThread {

	public static void main(String[] args) {
		// printTheThreadWhoCalledMe();
		
		Something s = new Something();
		Thread t = new Thread(s, "kuki");
		t.start();
		
		Something s2 = new Something();
		Thread t2 = new Thread(s, "shuki");
		t2.start();
		
		printTheThreadWhoCalledMe();
		//new Thread(new Something(), "kuki").start();
	}
	
	static void printTheThreadWhoCalledMe()
	{
		// PRint the name of the thread that called this function
		System.out.println(Thread.currentThread().getName() + 
				" called me");
	}

}
class Something implements Runnable
{
	@Override
	public void run() {
		TestCurrentThread.printTheThreadWhoCalledMe();
	}		
}
