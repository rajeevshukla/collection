package com.demo.generics;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileIImpl {
	
	
	public static void main(String[] args) {
		init();
		System.out.println("IF YOU ARE ABLE TO SEE THIS LINE THEN YOUR PROPERTIES IS LOADED. ");
		
		
		
	try {
		Process ps =Runtime.getRuntime().exec("ifconfig ");
		   System.out.println(ps.waitFor());
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
		/*
		String baseDirectory=ApplicationUtils.getCustomProperty("baseDir"); //loading from property file

		 File file=new File(baseDirectory);
		 
		 if(file.exists() &&  file.isDirectory()){
			 
			   
			File []listOfFiles= file.listFiles(new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					   if(pathname.isDirectory()){
						   return true;
					   }
					   return true;
				}
			});
			 
			for (File exisingFile : listOfFiles) {
				
				System.out.println(exisingFile.getName() );
				 
			
			
			}
			 
		 }else {
			 System.out.println(file.getAbsolutePath() +" Does not existing on file system or a directory");
		 }
*/		
	}
	
 private static void init(){
	 
	 try {
		 ApplicationUtils.properties.load(FileIImpl.class.getResourceAsStream("/com/demo/generics/config.properties"));
		 System.out.println("Config properites loaded successfully");
	 } catch (IOException e) {
		e.printStackTrace();
		System.out.println("Config properties not loaded successfully");
		System.exit(0);
	}
		
	}
	
}
