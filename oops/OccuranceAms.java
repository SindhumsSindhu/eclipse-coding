package oops;

import java.util.Scanner;
class Amsterdam{
	public int countAm(String s) {
		String str=s.toLowerCase();
		System.out.println("str:"+str);
		int cnt=0;
		String a[]=str.split(" ");
		for(int i=0;i<a.length;i++) {
			if(a[i].equals("am")) {
				cnt=cnt+1;
			}
			System.out.println(a[i]);
		}
		return cnt;
	}
}

public class OccuranceAms {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scan.nextLine();
		Amsterdam a1=new Amsterdam();
		int count =a1.countAm(s);
		System.out.println("print count:"+count);
		
	}

}
