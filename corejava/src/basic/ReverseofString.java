package basic;

public class ReverseofString {

	public static void main(String[] args) {
		//String str="welcome";
		//for(int i=str.length()-1;i>0;i--) {
			//System.out.println(String[i]);
		
		//String s="welcome";
		//StringBuilder sb=new StringBuilder();
		//sb.append(s);
		//sb.reverse();
		//System.out.println("Reverse String:"+sb);
		
		String s="welcome";
		StringBuffer sb=new StringBuffer();
		sb.append(s);
		sb.reverse();
		System.out.println("Reverse String:"+sb);
		
		//Reverse the string using for loop
		
		String s1="welcome";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			
		}
		System.out.println("reverse of string using for loop:"+rev);
		
         //check for palindrome
		
		String s11="malayalam";
		String rev1="";
		for(int i=s11.length()-1;i>=0;i--) {
			rev1=rev1+s11.charAt(i);
			
		}
		System.out.println("reverse of string using for loop:"+rev1);
          if(s11.equalsIgnoreCase(rev1)) {
        	  System.out.println("number is palindrome");
        	  
          }
          else {
        	  System.out.println("number is not palindrome");
          }
	}

}
      