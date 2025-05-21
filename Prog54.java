package dhivya;
class Cow{
	int age=5;
	Cow(String name)
	{
		System.out.println(name);
	}
	void makesound()
	{
		System.out.println("this animal can sound");
	}
}
class Goat extends Cow
{
   Goat()
	{
	   super("divi");
	   super.makesound();
	   System.out.println(super.age);
		System.out.println("goat");
	}
}
public class Prog54 {
	public static void main(String args[])
	{
    Goat obj=new Goat();
	}
	

}
