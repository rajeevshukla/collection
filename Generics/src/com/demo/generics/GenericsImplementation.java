package com.demo.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class GenericsImplementation {
	//gene
	//i want to create a generic  class will be add numbers  
	// byte , short , long , double , float , int
	// subtyping principle
	public static void main(String[] args) {
		//java 1.7. 
	/*
	List<Integer> is a subtype of 	Collection<Integer> //yes 
	
	ArrayList<Integer> is a subType of List<Integer> //yes 
		
	ArrayList<Integer> is a subType of Collection<Integer>  //yes 

	
	ArrayList<Object> is a SubType of Collection<Integer>  ??  No
	 
	 */
	
		
		ArrayList<Integer> listOfObject=null;
		
		//Collection<Number> listOfColection=listOfObject;
		
		
		
		//java support backward compatibility  1.2 ----- > 1.7  
		
		// 1.2  List 
		//generic came in 1.5
		//generic are compile time concept/// jvm has no information regarding generics
		///generic are eraser  types 
		List listOfGeneric=new ArrayList();
		
		List<Integer> listOfInteger=new ArrayList<Integer>();
		listOfInteger.add(2);
		//compiler
		  //list.add(2);

		/*
		for (Object object : listOfString) {
			System.out.println((String)object);
		}
		
		*/
		
		AddTwoNumber<Integer> addTwoNumber=new AddTwoNumber<Integer>();
		//addTwoNumber.add(number1, number2);
		AddTwoNumber<Float> addTwoNumber2=new AddTwoNumber<Float>();
		
		
		traverse(listOfObject);
		traverse(new ArrayList<Float>());
		
		
	}
	
	
	public static void  traverse(Collection<? extends Number> number){  //extends wild card 
		// automatically you will follow get principle. 
		// get principle says you can not add anything but you can get everything. 
		// number.add(new Integer(2));
		
	}
	
}
