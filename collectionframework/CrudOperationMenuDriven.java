package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Learner{
	int lno;
	String lname,ldegree;
	public Learner(int lno, String lname, String ldegree) {
		super();
		this.lno = lno;
		this.lname = lname;
		this.ldegree = ldegree;
	}
	@Override
	public String toString() {
		return "Learner [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
	}
	
}

public class CrudOperationMenuDriven {

	public static void main(String[] args) {
		ArrayList<Learner> l=new ArrayList<Learner>();
		Scanner s=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.insert data");
			System.out.println("2.display data");
			System.out.println("enter your choice");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.print("enter lno");
				int lno=s.nextInt();
				System.out.print("enter lname");
				String lname=s.next();
				System.out.print("enter ldegree");
				String ldegree=s.next();
				l.add(new Learner(lno,lname,ldegree));
				break;
				
			
			
			case 2:
				Iterator<Learner> i=l.iterator();
				while(i.hasNext()) {
					Learner le=i.next();
					System.out.println(le);
				}
				
				
			}
		}while(choice!=0);
		
	

	}

}
