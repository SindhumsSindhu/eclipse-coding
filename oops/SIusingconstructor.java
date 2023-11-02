package oops;

import java.util.Scanner;
//SuperClass 
class Student {
	String name;

	Student(String nm) {
		name = nm;
		System.out.println(name);
	}
}

//Subclass 
class Developer extends Student {
	String role;
	String name;

	public Developer(String role, String name) {

		super(name);
		this.role = role;
		System.out.println(role);
	}
}

public class SIusingconstructor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Role ane Name");
		String role = scan.next();
		String name = scan.next();
		Developer d1 = new Developer(role,name);
		
	}

}


	


