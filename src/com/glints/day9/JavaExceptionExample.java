package com.glints.day9;

public class JavaExceptionExample {
	public static void main(String[] args) {
		// ArithmeticException
//		try {
//			int data = 0;
//			data = 100 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException : " + e);
//		} finally {
//			System.out.println("finally");
//		}
		
		// NullPointerException
//		try {
//			String s = null;
//			System.out.println(s.length());
//		} catch (NullPointerException e) {
//			System.out.println("NullPointerException : " + e);
//		}
		
		// NumberFormatException
//		try {
//			String s="abc";  
//			int i=Integer.parseInt(s);//NumberFormatException 
//		} catch (NumberFormatException e) {
//			System.out.println("NumberFormatException : " + e);
//		}
		
		// ArrayIndexOutOfBoundsException
		try {
			int a[]=new int[5];  
			a[10]=50; //ArrayIndexOutOfBoundsException  
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException : " + e);
		}
	}
}
