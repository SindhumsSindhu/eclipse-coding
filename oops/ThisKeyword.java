package oops;

public class ThisKeyword {
	int a,b;
	public void setdata(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void displaydata() {
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
	}

	public static void main(String[] args) {
		ThisKeyword e=new ThisKeyword();
		
		e.setdata(10,10);
		e.displaydata();
		

	}

}
