package basic;

public class Pyramid {

	public static void main(String[] args) {
		int row=3;
		for (int i = 0; i <row; i++) {

			for (int j = row - i; j > 1; j--) { 

			System.out.print(" "); 
			}

			for (int k = 0; k <= i; k++) { 
			System.out.print("* "); 
			}
			System.out.println(); 
		

	}

}
}
