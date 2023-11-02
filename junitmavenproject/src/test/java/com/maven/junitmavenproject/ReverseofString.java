package com.maven.junitmavenproject;


	interface RevString{

		boolean rev(String s); 

		}
	public class ReverseofString {
	public static void main(String[] args) {
		   RevString rs=(String s)->

		      {

		    	  String revs="";

		    	  for (int i=0; i<s.length()-1; i--) {

		    		  char w=s.charAt(i);

		    		  revs=revs+w;

		    	  }

		      return revs;

			};

		System.out.println("Reverse :"+rs.rev("Welcome"));

		}

		

	}


