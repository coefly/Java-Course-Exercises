package com.course.collections;

import java.util.*;

import com.course.shapes.MyPoint;

public class TestMap {

	public static void main(String[] args) 
	{
		Map<String, MyPoint> myMap = new HashMap<>();
		myMap.put("key1", new MyPoint(1, 1));
		myMap.put("key2", new MyPoint(2, 1));
		myMap.put("key3", new MyPoint(3, 1));
		myMap.put("key4", new MyPoint(4, 1));
		myMap.put("key5", new MyPoint(5, 1));
		myMap.put("key6", new MyPoint(6, 1));
		myMap.put("key7", new MyPoint(7, 1));
		myMap.put("key8", new MyPoint(8, 1));
		
		myMap.put("key3", new MyPoint(66, 66));
		
		// There is a serious problem! - all collections return
		// Objects! there is no type safety
		// Object obj = myMap.get("key7");
		MyPoint val = myMap.get("key7");
		
		printMap(myMap);
	}
	
	public static void printMap(Map<String, MyPoint> myMap)
	{
		// 1. iterate over keys
		System.out.println("*********** KEYS **************");
		Set<String> keys = myMap.keySet();
		for (String key : keys)
		{
			System.out.println(key + " ----> " + myMap.get(key));
		}
		
		// 2. iterate over values
		System.out.println("*********** VALUES **************");
		Collection<MyPoint> values = myMap.values();
		for (MyPoint val : values)
		{
			System.out.println(val.getX() + " : " + val.getY());
		}
		
		// 3. iterate over entries
		System.out.println("*********** ENTRIES **************");
		Set<Map.Entry<String, MyPoint>> entries = myMap.entrySet();
		for (Map.Entry<String, MyPoint> entry : entries)
		{
			// We must downcast.... Beuaaaaaaa
			// Map.Entry entry = (Map.Entry)ent;
			System.out.println(entry.getKey() + " --> " + 
					entry.getValue());
		}
	}

}
