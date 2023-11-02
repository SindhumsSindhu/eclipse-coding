package oops;

abstract class A{
	public abstract void func();
	static void display() {
		
	}
}

class B extends A{
	void func() {
		System.out.println("static abstract method implemented");
		}
	}

public class AbstractwithStatic {

	public static void main(String[] args) {
		B b=new B();
		b.func();
		

	}

}
