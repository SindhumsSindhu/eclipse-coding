package basic;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name,age,percentage:");
		String name=sc.nextLine();
		int age=sc.nextInt();
		
		float percentage=sc.nextFloat();
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("percentage:"+percentage);

	}

}
