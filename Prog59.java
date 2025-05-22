package dhivya;
class A
{
	final void display()
	{
		System.out.println("Hello A");
	}
}
class B extends A
{
     int b=300;
     void show()
     {
    	 
     
		System.out.println(b);
     }
	
}
public class Prog59 {
	public static void main(String[] args)
	{
		final int a=10;
		//a=30;
		System.out.println(a);
		B obj=new B();
		obj.show();
		obj.display();
	}

}
