package exception;

public class ArrayIndexOutOfBoundEx {

	public static void main(String[] args) {
		try
		{
		
		int[] numbers = {1, 2, 3,5}; 
		System.out.println(numbers[1]);
		int c=10/0;
		System.out.println(c);
		String s="1234";
				int a2=Integer.parseInt(s);
		System.out.println(+a2);
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Some Error in code."+a);
		}
		
		catch (ArithmeticException a)
		{
		     System.out.println("number cannot be divided by zero"+a);
		}
		
		catch(NumberFormatException a) {
			System.out.println("number format exception"+a);
			
		}
		
		finally {
			System.out.println("the end");
		}

	}

}
