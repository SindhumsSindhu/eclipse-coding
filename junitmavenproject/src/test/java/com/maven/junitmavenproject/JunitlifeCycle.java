package com.maven.junitmavenproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitlifeCycle {
	
	
	@BeforeClass
	public static void beforeAll() { 
	System.out.println("Connect to the database");
	}
	@Before
	public void beforeEach() { 
	System.out.println("Load the schema");
	}

	@After
	public void afterEach() { 
	System.out.println("Drop the schema");
	}
	@AfterClass
	public static void afterAll() {
	System.out.println("Disconnect from the database");
	}
	@Test
	public void testOne() { 
	System.out.println("Test One");
	}
	@Test
	public void testTwo() { 
	System.out.println("Test Two");
	}


}
