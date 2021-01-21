package com.glints.day6;

public class TestArray2 {
	public static void main(String[] args) {
		int[] arr = {33,4,55,6}; 
		min(arr);
	}
	
	static void min(int arr[]) {
		int min = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
