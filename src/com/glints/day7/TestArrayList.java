package com.glints.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		List<String> cars = new ArrayList<String>();
		//add
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("BMW");
		
		//set
		cars.set(0, "Toyota");
		
		//remove
//		cars.remove(0);
		
		//clear
//		cars.clear();
		
		//size
		System.out.println(cars.size());
		
		//sort
//		Collections.sort(cars);
		
		//reverse
//		Collections.reverse(cars);
		
		System.out.println("==Cars==");
		for (String c : cars) {
			System.out.println(c);
		}
	}
}
