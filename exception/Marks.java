package exception;

import java.util.Scanner;

public class Marks {
	static void validageMarks(int marks) {
		if(marks>0 && marks<=100) {
			System.out.println(marks+ "is a valid marks");
			
		}
		else {
			throw new ArithmeticException("invalid marks");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		
		validageMarks(marks);
		

	}

}
