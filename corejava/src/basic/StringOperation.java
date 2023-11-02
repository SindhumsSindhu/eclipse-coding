package basic;

public class StringOperation {

	public static void main(String[] args) {
		String str ="Black";
		String str1 ="black";
		String str2 = "pink";

		System.out.println("length of string :"+str.length());
		System.out.println("to Uppercase :"+str.toUpperCase());
		System.out.println("to Lowercase :"+str.toLowerCase());
		System.out.println("Equals :"+str.equals(str1));
		System.out.println("Equal Ignore :"+str.compareToIgnoreCase(str1));
		System.out.println("Concat :"+str.concat(str1));
		System.out.println(str.compareTo(str1));
		System.out.println("compare to IgnoreCase:"+str.compareToIgnoreCase(str2));
		System.out.println(str.contains("str2"));
		System.out.println("index of c"+ str.indexOf('c'));
		System.out.println("index of a"+ str.indexOf('B'));
		System.out.println(" last index of a"+ str.indexOf('c'));
		System.out.println("replace string :"+ str.replace("Black","pink"));
		
		String str4 = "How are you?";
		String arrStr[] = str4.split(" ", 3);
		System.out.println("Splited Elements:");
		for(int i=0;i<arrStr.length;i++) {
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();
		System.out.println("Splited Elements using for each loop:");
			for (String str5 : arrStr) {
				System.out.print(str5 + " ");
			}
			String str6=" ";
			System.out.println("is String is empty:"+ str6.isEmpty());
			System.out.println("is String is blank:"+ str6.isBlank());
			
		
		

	}

}
