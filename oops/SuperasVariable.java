package oops;

class Person {
	int age = 50;
	int rno=67;
}

public class SuperasVariable extends Person {
	int age = 30;//Instance variable

	void insertStudentAge() {
		int age = 20;//local variable
		System.out.println("Parent class: "+super.age);

		System.out.println("Local variable:"+age);
		System.out.println("Rollno :"+rno);

		System.out.println("Instance Variable:"+this.age); // 30
	}

	public static void main(String[] args) {

		SuperasVariable e = new SuperasVariable();
		System.out.println(e.age);
		e.insertStudentAge();

	}

}






