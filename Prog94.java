package dhivya1;
class A2 extends Thread{
	int j=0;
	public  void run()
	{
		for(int i=0;i<50;i++)
		{
			j=i;
		}
	}
}
public class Prog93 {
	public static void main(String args[])
	{
		A2 obj=new A2();
		obj.start();
		try {
		obj.join();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(obj.j);
	}
}

