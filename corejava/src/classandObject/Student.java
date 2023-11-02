package classandObject;

public class Student {
	int rollno;
	String name;
	
	//constructor
	public Student() { //default
	rollno=8;
	name="ram";
	}
	public Student(int rollno,String nm) {
		this.rollno=rollno; //parameterized 
		name=nm;
		
	}
	void display() {
		System.out.println("student rollno:"+rollno);
		System.out.println("student name:"+name);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.rollno=10;
		s.name="sindhu";
		s.display();
		
		Student s1=new Student();
		s1.rollno=9;
		s1.name="sahana";
		s1.display();
		
		Student s2=new Student(5,"anu");//parameterized constructor
		s2.display();
		
		Student s3=new Student();//default constructor
		s3.display();
		
		
	}

}
