package basic;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("enter any no");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("num is positive");
		}
		else if(num<0) {
			System.out.println("num is negative");
			
		}
		else {
			System.out.println("num is zero");
		}
	}

}
