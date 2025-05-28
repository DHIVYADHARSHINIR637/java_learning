package dhivya;
interface Animal1{
	int mark=20;
	void sound();
}
class Cat1 implements Animal1{
	public void sound()
	{
		System.out.println("meoww");
	}
}
public class Prog64 {
	public static void main(String args[])
	{
	Cat1 obj=new Cat1();
	
	obj.sound();
	System.out.println(obj.mark);
	}
	
	

}
