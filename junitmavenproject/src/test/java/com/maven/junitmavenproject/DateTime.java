package com.maven.junitmavenproject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {
	public static void main(String[] args) {

		//Date

		LocalDate today = LocalDate.now();

		System.out.println("Current Date="+today);

		

		//Time

		LocalTime time = LocalTime.now();

		System.out.println("Current Time="+time);

		

		//DateTime

		LocalDateTime specificDate = LocalDateTime.now();

		System.out.println("Current DateTime="+today);

		

		//BirthdayDate

		LocalDate firstDay_2023 = LocalDate.of(1999, Month.JANUARY, 31);

		System.out.println("Birthday Date="+firstDay_2023);

 

		

	}

}
