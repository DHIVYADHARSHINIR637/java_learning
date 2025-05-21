package dhivya;
class Vehicle{
	String brand;
	int year;
	void startEngine(){
		
	}
}
class Car extends Vehicle
{
	String fueltype;
	void startEngine(){
		System.out.println("car engine starts.");
	} 
	void drive(){
		System.out.println("car is driving.");
	}
}
class Truck extends Vehicle{
	int loadCapacity;
	void startEngine(){
		System.out.println("truck engine starts.");
	}
	void haul(){
		System.out.println("truck is hauling.");
	}
}
public class Prog53 {
	public static void main(String args[]){
		Truck obj=new Truck();
		obj.brand="toyoto";
		obj.year=2016;
		obj.loadCapacity=200;
		obj.startEngine();
		obj.haul();
		Car obj1=new Car();
		obj1.brand="tata metor";
		obj1.year=2012;
		obj1.fueltype="petrol";
		obj1.startEngine();
		obj1.drive();
		
		
	}

}
