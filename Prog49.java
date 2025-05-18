package dhivya;
class Animal{
	 void eat()
	 {
		 System.out.println("this animals can eat");
	 }
}
class Dog extends Animal{
	 void bark()
	 {
		 System.out.println("barks");
	 }
}

public class Prog49 {
	public static void main(String args[])
	{
		Dog obj=new Dog();
		obj.bark();
		obj.eat();
	}

}
