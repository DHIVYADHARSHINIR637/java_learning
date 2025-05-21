package dhivya;
class Animalss{
	void eat()
	{
		System.out.println("this animla eat");
	}
}
class Dogss extends Animalss
{
	void bark()
	{
		System.out.println("dog bark");
	}
}
class Cat extends Animalss{
	void meow()
	{
		System.out.println("cat can meow");
	}

}
public class Prog51 {
	public static void main(String[] args)
	{
		Cat obj=new Cat();
		obj.meow();
		obj.eat();
		Dogss obj1=new Dogss();
		obj1.bark();
		obj1.eat();
	}

}
