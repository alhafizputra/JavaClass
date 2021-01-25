package com.glints.day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestArraySet {
	public static void main(String[] args) {
		Set<String> cars = new HashSet<>();
//		TreeSet<String> cars = new TreeSet<>();	// berurutan sesuai abjad
//		LinkedHashSet<String> cars = new LinkedHashSet<>(); // berurutan sesuai inputan
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("BMW");
		cars.add("Mazda");
		for(String c : cars) {
			System.out.println(c);
		}
		
//		Iterator data = cars.iterator();
//		while(data.hasNext()) {
//			System.out.println(data.next());
//		}
	}
}
