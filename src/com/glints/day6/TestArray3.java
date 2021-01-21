package com.glints.day6;

public class TestArray3 {
	public static void main(String[] args) {
		int[][] arrm = {{1,2,3},{2,4,5},{4,4,5}};
		for (int i = 0; i < arrm.length; i++) {
			for (int j = 0; j < arrm.length; j++) {
				System.out.print(arrm[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
