package com.maven.junitmavenproject;
interface Str1{
	default void display() {
		System.out.println("Hello");
	}
	static void display1() {
		System.out.println("hello of static method");
	}
	void display2();
}

public class StaticDefaultEx implements Str1 {

	public static void main(String[] args) {
		 StaticDefaultEx s=new  StaticDefaultEx();
		 s.display();
         s.display2();
         Str1.display1();
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		
	}

}
