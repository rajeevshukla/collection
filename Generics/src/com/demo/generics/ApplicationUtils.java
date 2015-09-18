package com.demo.generics;

import java.util.Properties;

public class ApplicationUtils {

	public  static Properties properties=new Properties();
	
	
	public static String getCustomProperty(String key){
		
		return properties.getProperty(key);
		
	}
	
	
	public static boolean isBlank(String value) {
		  if(value!=null && value.trim().length()>0){
			  return false;
		  }
		  return true;
	}
}

