cpackage dhivya;
class Counter{
	static int count=0;
	int instanceNumber=0;
	Counter()
	{ 
		
		
	  instanceNumber=instanceNumber+1;
		count=count+1;
	}
	void display() {
		System.out.println("instance Number:"+instanceNumber);
		System.out.println("static count:"+count);
	}
	
}
public class Prog61 {
	public static void main(String args[])
	{
		Counter obj1=new Counter();
		obj1.display();
		Counter obj2=new Counter();
		obj2.display();
		Counter obj3=new Counter();
		obj3.display();
		
		
		
		
	}

}
