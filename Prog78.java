package dhivya1;
interface Greet{
	void sayHello(String name);
	
	
}

public class Prog78 {
	public static void main(String args[])
	{
		Greet obj=(name)->{System.out.println("hello "+name+"!");};
		obj.sayHello("dhivya");
		
	}

}
