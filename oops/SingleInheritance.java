package oops;


//super class
class Student{
	String name="sindhu";
	
	void display() {
		System.out.println(name);
	}
}
//sub class
class developer extends Student{
	String role="java";
	void displayRole() {
		System.out.println(role);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		developer d1=new developer();
		d1.display();
		d1.displayRole();

	}
		

	}


