package com.demo.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		
		
		
		Map<Integer, Integer> map=new TreeMap<Integer,Integer>(); /// data in sorted order its sorts based on key only. 

		map.put(123, 323);
		map.put(12, 323);
		map.put(121, 323);
		map.put(120, 323);
		map.put(1211, 323);
		map.put(10, 323);
		map.put(11, 323);

		// it is using comparable internally, key must implements comparable interface
		System.out.println(map);
		
		System.out.println(2>>6); //2*2^6 //2^7     // no/2^6  2/128; 0.00000
		// 010
		System.out.println();
		
		
		Map<Employee, Integer> employeObjectFrequency=new TreeMap<Employee, Integer>();
		employeObjectFrequency.put(new  Employee(101), 10);
		employeObjectFrequency.put(new  Employee(102), 10);
		
		System.out.println(employeObjectFrequency);
		
		//treemap resposible for sorting any kind of map object
		//treeset repsoniblit for sorting any kind of set object
		//Collections.sort() responsible for sorting of List of object. 
		
	}
}
