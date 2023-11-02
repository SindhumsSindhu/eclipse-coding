package com.maven.junitmavenproject;

import java.util.Scanner;

@FunctionalInterface
interface Validate{
	boolean login(String uname,String password);
	
}


public class ValidateUser {
	boolean login(String uname,String password) {
		Validate v=(u,p)->{
			return(uname.equals("Sindhu")&&(password.endsWith("1234")));
		};
		return v.login(uname, password);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name and password");
		String password=sc.next();
		String uname=sc.next();
		ValidateUser v=new ValidateUser();
		System.out.println(v.login(uname, password));
		

	}

}
