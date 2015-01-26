package com.course.collections;

import java.util.*;

import com.course.shapes.MyPoint;

public class TestList {

	public static void main(String[] args) 
	{
		List<Integer> myList = new LinkedList<>();
		myList.add(34);
		myList.add(134);
		myList.add(324);
		// myList.add("assaf");
		myList.add(34);
		// myList.add("assaf");
		// myList.add(3.4);
		// myList.add(new MyPoint(2, 4));
		myList.add(34);
		
//		System.out.println(myList);
		int num = myList.get(5);
		printList(myList);
	}
	
	public static void printList(List<Integer> list)
	{
		// 1. use regular for loop (BAD... hint: only 
		// for LinkedList)
		for (int i  = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		// 2. MUCH BETTER - use iterators
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext())
		{
			int element = iter.next();
			System.out.println(element);
		}
		
		// 3. THE BEST OPTION - USE 'for each'
		// for each Object o inside list do:
		for (int o : list)
		{
			System.out.println(o);
		}
		
	}
	

}
