package basic;

public class BreakEx {

	public static void main(String[] args) {
		System.out.println("break statement");
		int i=0;
		while(i<5) {
			if(i==2) {
				break;
			}
			System.out.println(i++);
		}
		System.out.println();

	}

}
