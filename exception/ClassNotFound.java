package exception;

public class ClassNotFound {

	public static void main(String[] args) {
		try
		{ 
			//Class.forName("class not exit");
			Class.forName("basic.Enum");
			System.out.println("class found");
			
		} 
		
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
