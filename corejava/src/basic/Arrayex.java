package basic;

public class Arrayex {

	public static void main(String[] args) {
		int num[]= {1,2,3};
		//2d array
		int a[][]= {{1,2},{4,5},{9,8}};
		System.out.println("a[0][0]:"+a[0][0]);
		System.out.println("a[0][1]:"+a[0][1]);
		System.out.println("a[1][0]:"+a[1][0]);
		System.out.println("a[1][1]:"+a[1][1]);
		for(int i=0;i<3;i++) {//row
			for(int j=0;j<2;j++) {//column
				System.out.println(a[i][j]);
			}
		}
		
		//System.out.println(num[2]);
		//for(int i=0;i<num.length;i++) {
			//System.out.println(num[i]);
		//for(int i=0;i<10;i++) {
			//System.out.println(i);
		//for(int i=5;i>=0;i--) {
			//System.out.println(i);
			
		}

	}

//}
