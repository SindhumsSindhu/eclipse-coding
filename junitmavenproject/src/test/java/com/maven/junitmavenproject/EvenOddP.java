package com.maven.junitmavenproject;

import static org.junit.Assert.assertFalse;


import org.junit.Test;

public class EvenOddP {
	public boolean isEvenNumber(int number) {
		boolean result=false;
		if(number%2==0) {
			result=true;
		}
		return result;

	}
	@Test
	public void evenNumberTest() {
		EvenOddP e=new EvenOddP();
		assertFalse(e.isEvenNumber(9));
	}
	
	

}
