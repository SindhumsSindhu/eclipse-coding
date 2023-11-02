package oops;
class Learner{
	public void lname() {
		System.out.println("my name is sindhu");
	}
	void courseName() {
		System.out.println("java full stack");
	}
	void courseDuration() {
		System.out.println("4 months");
	}
}
class Lcourse extends Learner{
	protected void courseName() {
		super.courseName();
		System.out.println("data analysis");
	}
	
	@Override
	void courseDuration() {
		System.out.println("2 months");
	}
}

public class MethodOverridingEx {

	public static void main(String[] args) {
		Lcourse l=new Lcourse();
		l.courseName();
		l.lname();
		l.courseDuration();
		Learner le=new Lcourse();
		le.courseName();
		le.lname();
		le.courseDuration();
		

	}

}
