package com.maven.junitmavenproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class NotnullEx {
	int a[]= {1,3,5};
	int b[]= {1,3,5};
	
	String s="welcome";
	String s1="welcome";
	@Test
	public void test() {
		assertArrayEquals(a, b);
	}
	@Test
	public void test1() {
		assertNotNull(s);
	}
	@Test
	public void test2() {
		assertSame(s,s1);

}
}
