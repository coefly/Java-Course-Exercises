package com.course.io;

import java.io.File;

public class TestFile {

	public static void main(String[] args) throws Exception
	{
		// NOTE: If the file does not exist, it will NOT be created
		// by this line
		File file = new File("test.file"); 
		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file.getName());
		
		file.createNewFile();
		// file.createTempFile(prefix, suffix)
		file.delete();
		
		File dir = new File("myDir");
		dir.mkdir();
		File son = new File(dir, "son.txt");
		son.createNewFile();
		
		showFiles(dir);
	}
	
	public static void showFiles(File f)
	{
		if (f.isDirectory())
		{
			File[] childs = f.listFiles();
			for (File child : childs)
			{
				showFiles(child);
			}
		}
		System.out.println(f.getName());
	}

}
