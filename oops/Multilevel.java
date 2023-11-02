package oops;
class Laptop{
	void displayItem() {
	System.out.println("laptop");
	}
}
class Name extends Laptop{
	void displayName() {
		System.out.println("Dell");
	}
}
class Model extends Name{
	void displayModel() {
		System.out.println("HDMI");
	}
}


public class Multilevel {

	public static void main(String[] args) {
	Model L=new Model();
	L.displayItem();
	L.displayName();
	L.displayModel();

	}

}
