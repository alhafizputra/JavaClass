package com.glints.day6;

import java.util.Arrays;

public class SortingArrayExample {
	public static void main(String[] args) {
		int[] arr = {23, 5, 77, 43, 64, 889, 9};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
