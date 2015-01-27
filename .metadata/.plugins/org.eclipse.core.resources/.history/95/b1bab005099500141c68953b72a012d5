package com.course.collections;

import java.util.LinkedList;
import java.util.*;

public class TestTypeSafetyProblem {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<>();
		l.add(544);
		l.add(1544);
		//l.add("25.44");
		l.add(3544);
		l.add(4544);
		sumList(l);
	}
	
	public static void sumList(List<Integer> list)
	{
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			// sum += (int)list.get(i);
			sum += list.get(i);
		}
		System.out.println("Sum: " + sum);
	}

}
