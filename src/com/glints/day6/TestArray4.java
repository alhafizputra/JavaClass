package com.glints.day6;

public class TestArray4 {
	public static void main(String[] args) {
		int[][] arrA = {{1,3,4},{3,4,5}};
		int[][] arrB = {{1,3,4},{3,4,5}};

		int[][] arrC = new int[arrA.length][arrA[0].length];
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrA[0].length; j++) {
				arrC[i][j] = arrA[i][j] + arrB[i][j];
				System.out.print(arrC[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

// 	1	3	4				1	3	4
//	3	4	5				3	4	5
