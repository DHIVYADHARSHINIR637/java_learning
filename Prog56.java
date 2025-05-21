package dhivya;
abstract class Vehicles{
	abstract void speed(); 
	void brand()
	{
		System.out.println("xyz brand");
	}
}
class  Bike extends Vehicles{
	void speed()
	{
		System.out.println("560cm.hr");
	}
	
}
class Cars extends  Vehicles{
	void speed()
	{
		System.out.println("600cm.hr");
	}
}
public class Prog56 {
	public static void main(String args[])
	{
	  Cars obj=new Cars();
	  obj.speed();
	  Bike obj1=new Bike();
	  obj1.speed();
	  obj1.brand();
	  
	  
	}

}
