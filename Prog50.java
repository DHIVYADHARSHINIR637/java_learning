package dhivya;
class Animals{
	void eat()
	{
		System.out.println("this animals can eats");
	}
}
class Dogs extends Animals{
	void bark()
	{
		System.out.println("dog barks");
	}
} 
class Puppy extends Dogs{
	void weep()
	{
		System.out.println("puppy weeps");
	}
}
public class Prog50{
	public static void main (String args[])
	{
		Puppy obj=new Puppy();
		obj.weep();
		obj.eat();
		obj.bark();
	}

}
