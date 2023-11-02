package classandObject;

import java.util.Scanner;

public class Copyconstructor {
	int rno;
	 String name;
	
	public Copyconstructor(int rno,String name) {
 this.name=name;
 this.rno=rno;
 
		
	}
	void display() {
		System.out.println("student rollno:" +rno);
		System.out.println("student name:" +name);
}

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter name");
	
	String name=sc.nextLine();
	System.out.println("enter roll number");
	int rno=sc.nextInt();
	
	 Copyconstructor s=new Copyconstructor(123, "Sindhu");
	
	s.display();
}
}
