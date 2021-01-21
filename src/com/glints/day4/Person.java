package com.glints.day4;

public class Person {
	private String name = "John";
	private int umur;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		if (umur % 2 != 0) {
			this.umur = 0;
		} else {
			this.umur = umur;

		}
	}
	
	protected void test() {
		System.out.println("test");
	}

}
