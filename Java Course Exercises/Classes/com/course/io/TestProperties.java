package com.course.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) 
	{
		// You can (but probably should not) access the system
		// environment variables
//		Map<String, String> envVars = System.getenv();
//		for (String key : envVars.keySet())
//		{
//			System.out.println(key + " : " + envVars.get(key));
//		}
		
		// System properties are the env variables of the JVM
		Properties props = System.getProperties();
//		for (Object key : props.keySet())
//		{
//			System.out.println(key + " : " + props.get(key));
//		}
		
		
		// This class is convenient to work with for properties
		// of any kind - for your programs ( e.g. ini files)
		try {
			props.store(new FileWriter("props.txt"), "Good morning!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
