package com.demo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {

		//key can be anything //object 
		//value can anythings 

		Map<Integer,Integer> jobIdFailureCount=new LinkedHashMap<Integer, Integer>();
		//need , 
		//maintain an order ?  use LInkedHashMap

		//want work on thread safe env ? use HashTable 

		//dont want to maintain an order User HashMap

		//want to get data in sorted order ? Use TreeMap


		jobIdFailureCount.put(12, 1);
		jobIdFailureCount.put(122, 1);
		jobIdFailureCount.put(124, 10);
		jobIdFailureCount.put(125, 1);
		jobIdFailureCount.put(122, 1);
		System.out.println(jobIdFailureCount);

		int failureCount=jobIdFailureCount.get(124);

		Set<Integer>  keySet= jobIdFailureCount.keySet(); //return setof keys availabe in map

		Iterator<Integer>  iterator=    keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			System.out.println("Key :"+key +" value:"+jobIdFailureCount.get(key));
		}
		System.out.println(" USING FOREACH ::::");
		for (Integer key : keySet) {
			System.out.println("Key :"+key +"values:"+  jobIdFailureCount.get(key));

		}
		
		System.out.println("VALUES ITERATION");
		Collection<Integer> values= jobIdFailureCount.values();
		System.out.println(" vALUE iTERATION : ");
		for (Integer value : values) {
			System.out.println("value : "+value);
		}
		System.out.println(failureCount);


		System.out.println(" ENTRY SET ITRATION");
		Set<Entry<Integer, Integer>> entrySet=jobIdFailureCount.entrySet();
		Iterator<Entry<Integer, Integer>> iterator2=      entrySet.iterator();

		while (iterator2.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) iterator2.next();
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}

		Map<Integer, Integer> antherJobIdFailureCount=new  HashMap<Integer, Integer>();
		  antherJobIdFailureCount.put(345, 9090);
		jobIdFailureCount.putAll(antherJobIdFailureCount);

		System.out.println(jobIdFailureCount);
		System.out.println("Size of Map :"+jobIdFailureCount.size());

	}
}
