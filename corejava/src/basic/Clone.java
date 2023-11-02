package basic;

public class Clone {

	public static void main(String[] args) {
		int intArray[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		int cloneArray[][] = intArray.clone();
		// shallow copy is created following print statement will print true 
		System.out.println(intArray[0] == cloneArray[0]); 
		System.out.println(intArray[1] == cloneArray[1]);
		for(int i=0;i<cloneArray.length;i++) {
			for(int j=0;j<5;j++)
				System.out.println("=>" + cloneArray[i][j]);
			
		}
	for(int i=0;i<cloneArray.length;i++) {
		for(int j=0;j<5;j++)
			System.out.println("=>" + cloneArray[i][j]+" ");
		
	}}
	
			
		
		//single dimension
       // int intArray[] = {0,1,2,3,4,5,6,7,8,9};
       // int cloneArray[] = intArray.clone();
// Deep copy is created following print statement will print false
        //System.out.println(intArray == cloneArray);
        //for (int i = 0; i < cloneArray.length; i++) { 
        //System.out.print(cloneArray[i]+" ");
}

		

	


