package dhivya;
import java.util.*;
class Person
{
   String  greet(String name)
	{
		
		return "Hello," + name +"! welcome to java.";
	}
}

public class Prog38 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Person obj=new Person();
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		String result=obj.greet(name);
		System.out.println(result);
	}

}
