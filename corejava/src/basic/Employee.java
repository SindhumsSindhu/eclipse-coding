package basic;

public class Employee {
	 private int eid;
     private String ename;
	 Employee(){}

	 Employee(int eid, String ename){
     this.eid=eid;
     this.ename=ename;
	 }
	 void display(int i) {
		 System.out.println("int"+i);
	 }
	 void display(byte i) {
		 System.out.println(i);
	 }
	 void display(float i) {
		 System.out.println("float"+i);
	 }
	 void display(double i) {
		 System.out.println("double"+i);
	 }

	public static void main(String[] args) {
	
        Employee eob2 = new Employee(1111,"Sindhu");

		 
          System.out.println(eob2.eid);  //1
          System.out.println(eob2.ename);
          eob2.display(89);
          eob2.display((byte)5);
          eob2.display(34.5);
          eob2.display(35.5f);

		    }

	}


