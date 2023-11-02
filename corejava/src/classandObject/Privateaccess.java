package classandObject;
class Privatedemo{
	 int b=1;
	 void display() {
		System.out.println("b:" +b);
	}
}


public class Privateaccess {
	private int a;

	public static void main(String[] args) {
		Privatedemo d=new Privatedemo();
		System.out.println("value of b:"+d.b);
		d.display();
		Privateaccess p=new Privateaccess();
				p.a=10;
				System.out.println(p.a);
		

	}

}
