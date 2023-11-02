package basic;
class Operation1 {
	void addition(int a,int b,int c) {
		System.out.println("addition of 3 numbers:"+(a+b+c));
		
	}
	int divide(int a,int b) {
		return a/b;
		
	}
public static int add(int a, int b) {
	return a+b;
	
}
public static int multiply(int a, int b) {
	return a*b;
}
	
}
public class Operation{
	public static void main(String[] args) {
		Operation1 o=new Operation1();
		o.addition(1, 3, 7);
		System.out.println("division:"+o.divide(12,13));
		int d=o.divide(15, 3);
		System.out.println("division:"+d);
		//int result=Operation.addition(5,10);
		
		
		
		
	}
	
}
