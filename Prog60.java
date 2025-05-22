package dhivya;
class Person5
{
	public String name;
	protected int age;
	private int scoialSecurityNumber;
	String address;
}
class Employee1 extends Person5
{
	Employee1(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		//this.socialSecurityNumber=socialSecurityNumber;
		this.address=address;
		
	}
	void show()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
	void display()
	{
		int socialSecurityNumber=10;
		System.out.println("socialSecurityNumber"+socialSecurityNumber);
	}
}
public class Prog60 {

	public static void main(String[] args) {
	Employee1 obj=new Employee1("dhivya",20,"channai");
	obj.display();
	obj.show();
	

	}

}
