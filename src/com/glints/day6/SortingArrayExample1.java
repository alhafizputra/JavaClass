package com.glints.day6;

public class SortingArrayExample1 {
	public static void main(String[] args) {
		int[] arr = {12,34,5,746,45,62};
		sortArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	private static void sortArray(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int a = arr[i];
			while((j>0)&&(arr[j-1]>a)) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=a;
		}
	}
}
