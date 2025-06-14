package dhivya1;
class A3 implements Runnable{
	public void run()
	{
		System.out.println("hi");
	}
}
public class Prog94 {
	public static void main(String args[])
	{
		Runnable obj=new A3();
		Thread a=new Thread(obj);
		a.start();
	}

}
