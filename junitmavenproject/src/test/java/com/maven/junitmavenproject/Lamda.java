package com.maven.junitmavenproject;

import java.util.Arrays;
import java.util.List;

public class Lamda {
	public static void main(String[] args ) {
	List<Integer> intSeq = Arrays.asList(1,2,3);
	intSeq.forEach(x -> System.out.println(x));

}
}

