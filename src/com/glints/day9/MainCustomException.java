package com.glints.day9;

public class MainCustomException {
	public static void main(String[] args) {
		try {
			validate(13);
		} catch (Exception e) {
			System.out.println("Exception occured : " + e);
		}
	}
	
	static void validate(int age) throws Exception {
		if (age < 18) {
			throw new Exception("not valid");
		} else {
			System.out.println("welcome to vote");
		}
	}
}
