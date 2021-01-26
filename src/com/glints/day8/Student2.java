package com.glints.day8;

public class Student2 {
	String name;
	int age;
	float percent;
	boolean isLocal;

	public Student2(String name, int age, float percent, boolean isLocal) {
		super();
		this.name = name;
		this.age = age;
		this.percent = percent;
		this.isLocal = isLocal; 
	}

	public void displayDetails() {
		System.out.println("Details..............");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Percent: " + this.percent);
		if (this.isLocal) {
			System.out.println("Nationality: Indian");
		} else {
			System.out.println("Nationality: Foreigner");
		}
	}
}
