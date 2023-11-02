package com.maven.junitmavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Addition {
	public int add(int a, int b) {
		return a+b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	@Test
	public void addTest() {
		assertEquals(4,add(2,2));
	}
	@Test
	public void mulTest() {
		assertEquals(18,mul(3,6));
	}


		//Factorial

		 	public int fact(int n) {

		 		int fact=1;

		 		for(int i=1;i<=n;i++) {

		 			fact=fact*i;

		 		}

		 		return fact;

		 	}

		 @Test

		 public void testFact() {

			 assertEquals(120, fact(5));

		 }

	}
	


