package com.course.collections;

import java.util.*;

import com.course.shapes.MyPoint;

public class TestSet {

	public static void main(String[] args) 
	{
		Set<Double> mySet = new HashSet<>();
		mySet.add(3.4);
		mySet.add(13.4);
		mySet.add(32.4);
		//mySet.add("assaf");
		//mySet.add(34);
		//mySet.add("assaf");
		mySet.add(3.4);
		//mySet.add(new MyPoint(2, 4));
		mySet.add(3.4);
		
//		System.out.println(mySet);
//		//System.out.println(mySet.get(5));
//		System.out.println(mySet.contains("assaf"));
		printSet(mySet);
	}
	
	public static void printSet(Set<Double> set)
	{
		// Cannot use for - no 'get'!
//		for (int i  = 0; i < set.size(); i++)
//		{
//			System.out.println(set.get(i));
//		}
		
		// 1. use iterators
		Iterator<Double> iter = set.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		// 2. for each - the preferred idiom for iteration
		for (double o : set)
		{
			System.out.println(o);
		}
//		for (Iterator iter2 = set.iterator(); iter2.hasNext();)
//		{
//			System.out.println(iter2.next());
//		}
				
	}

}
