package dhivya;
import java.util.*;
class Human{
	private int age;
	private String name;
	void display(int age,String name)
	{
		this.age=age;
		this.name=name;
		System.out.println(this.age);
		System.out.println(this.name);
	}
}
public class Prog67 {
	public static void main(String args[])
	{

		Human obj=new Human();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
	    int age=sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter your name:");
		String name=sc.nextLine();
		obj.display(age,name);
	}

}
