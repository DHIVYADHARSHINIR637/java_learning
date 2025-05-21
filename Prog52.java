package dhivya;
class Anima{
	void eat()
	{
		System.out.println("this animals eat");
	}
}
class Do extends Anima{
	void bark()
	{
		System.out.println("dog bark");
	}
}
class Catt extends Anima{
	void meow()
	{
		System.out.println("cat can meow");
	}
}
class Pupp extends Do
{
	void weep()
	{
		System.out.println("puppy can weep");
	}
}
public class Prog52 {
	public static void main(String[] args)
	{
		Pupp obj=new Pupp();
		obj.weep();
		obj.bark();
		obj.eat();
	}

}
