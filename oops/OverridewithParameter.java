package oops;
class UserInput{
	public void data(int a,int b) {
		System.out.println(a+" "+b);
	}
}
class UserAddition extends UserInput{
	public void data(int a,int b) {
		System.out.println("sum"+a+" "+b);
	}
	
}

public class OverridewithParameter {

	public static void main(String[] args) {
		UserInput u=new UserInput();
		u.data(3, 7);
		UserInput us=new UserInput();
		us.data(5, 9);

	}

}
