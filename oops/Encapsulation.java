package oops;

public class Encapsulation {
	private int balance;

	public int getBalance()
	{
		return balance;
	}

	public void setBalance(int balance)
	{
		this.balance = balance;
	}


	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setBalance(10000);
		System.out.println("My Balance:" +e.getBalance());
		

	}

}
