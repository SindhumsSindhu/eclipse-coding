package basic;
class Student{
	static int fee;
	static String name="sindhu";
}

public class StaticEx {
	public static void main(String[] args) {
		Student.fee=1000;
		System.out.println("fee:"+Student.fee);
		Student.name="john";
		System.out.println("Name:"+Student.name);
		
		
		
	}

}
