package basic;

public class NestedLoop {

	public static void main(String[] args) {
	/*int num;
	for(int i=1;i<=5;i++) {
		System.out.println("value of i"+i);
		for(int j=1;j<=i;j++) {
			System.out.println("value of j"+j);
		}
		
	}*/
		/*for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		/*int row = 3;
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();

	}*/
		
		/*for (int i= 0; i<= 3; i++)  
		{  
		for (int j=0; j<=i; j++)   
		{  
		System.out.print("* ");  
		}   
		System.out.println("");   
		}   
		for (int i=3; i>=0; i--)  
		{  
		for(int j=0; j <= i-1;j++)  
		{  
		System.out.print("*"+ " ");  
		}  
		System.out.println("");
			
		

}*/
		
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}

		}
	}
}