package dhivya;
 class ConstantValue{
	final double pi=3.14;
}
class  Hello extends ConstantValue{
	
	void display()
	{
	 System.out.println("value pi:"+pi);
	}
	
}
public class Prog62 {
	public static void main(String args[]) {
		Hello obj=new Hello();
		obj.display();
		
	}
}


