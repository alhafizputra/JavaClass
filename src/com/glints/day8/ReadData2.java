package com.glints.day8;

import java.util.Scanner;

public class ReadData2 {
	public static void main(String args[]){
	      //Instantiating the Scanner class
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your name: ");
	      String name = sc.next();
	      System.out.println("Enter your age: ");
	      int age = sc.nextInt();
	      System.out.println("Enter your percent: ");
	      float percent = sc.nextFloat();
	      System.out.println("Are you local (enter true or false): ");
	      boolean isLocal = sc.nextBoolean();
	      Student2 std = new Student2(name, age, percent, isLocal);
	      std.displayDetails();
	   }
}
