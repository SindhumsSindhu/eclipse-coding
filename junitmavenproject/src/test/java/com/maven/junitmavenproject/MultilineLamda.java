package com.maven.junitmavenproject;

import java.util.Arrays;
import java.util.List;

public class MultilineLamda {

	public static void main(String[] args) {
		/*List<Integer> intSeq = Arrays.asList(1,2,3);
		intSeq.forEach(x -> { x+= 2; 
		System.out.println(x);
		});*/
		
		//lamda with local variable
		/*List<Integer> intSeq = Arrays.asList(1,2,3);
		intSeq.forEach(x -> {
		int y = x * 2;
		System.out.println(y);
		});*/
		
		//lamda with parameters
		
		List<Integer> intSeq = Arrays.asList(1,2,3);
		intSeq.forEach((Integer x) -> { 
		x += 2; 
		System.out.println(x);
		});

	}

}
