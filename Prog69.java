package dhivya;
interface Animal10{
	void sound();
}
class Dog9 implements Animal10{
	public void sound()
	{
		System.out.println("dog bark");
	}
}
class Cat8 implements Animal10
{
	public void sound() {
		System.out.println("mewow");
	}
	
}

public class Prog69 {
	public static void main(String args[])
	{
		Cat8 c1=new Cat8();
		c1.sound();
		Dog9 d=new Dog9();
		d.sound();
		
	}

}
