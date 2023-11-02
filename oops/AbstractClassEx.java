package oops;

abstract class Vehicle1{
	public Vehicle1() {
		
		System.out.println("Vehicle Constructor");
	}
	abstract void show();
	void vehicleBrand() {    //This is my non Abstract method 
		System.out.println("Non abstract method");
	}
	public  static void display() {
		System.out.println("Static display method");
	}
	
	
	
}
class Bike extends Vehicle1{

	@Override
	void show() {
		System.out.println("Bike");
	}
	
}
class Car extends Vehicle1{

	@Override
	void show() {
		System.out.println("car");
	}
	
}

public class AbstractClassEx {

	public static void main(String[] args) {
		//Vehicle1 v=new Car();
	       // v.show();
	        Vehicle1 c=new Bike();
	        c.show();
	        c.vehicleBrand();
	        Car.display();
	        Bike.display();
	        Vehicle1.display();
	

	}

}
