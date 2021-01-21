package com.glints.day5;

public class StringImmutable {
	public static void main(String[] args) {
		String s = "Sachin ";
		s.concat("Tendulkar");;
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Sachin ");
		sb.append("Tendulkar");
		System.out.println(sb);
	}
}
