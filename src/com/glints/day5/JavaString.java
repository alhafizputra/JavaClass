package com.glints.day5;

public class JavaString {
	public static void main(String[] args) {
		String s= "JavaHello";
		//charAt
		System.out.println(s.charAt(2));
		//length
		System.out.println(s.length());
		//substring
		System.out.println(s.substring(3, 6));
		//contains
		System.out.println(s.contains("a"));
		//equals
		System.out.println(s.equalsIgnoreCase("javahello"));
		//isEmpty
		System.out.println(s.isEmpty());
		//replace
		System.out.println(s.replace("JavaHello", "Test"));
		//toUpperCase
		System.out.println(s.toUpperCase());
		//concat
		System.out.println(s.concat("PHP"));
	}
}
