package com.ga.aia;

public class HelloWorld {

	int x;
	
	public HelloWorld() {

	}

	public HelloWorld(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		HelloWorld hellow = new HelloWorld(2);
		HelloWorld hellow2 = new HelloWorld();
//		this.x = 5;
		hellow.test();
		System.out.println(hellow.x);
		System.out.println(hellow2);

	}

	void test() {
		Hello h = new Hello();
		h.hello();
	}

	class Hello {

		public void hello() {
			System.out.println("Hello");

		}
	}
}
