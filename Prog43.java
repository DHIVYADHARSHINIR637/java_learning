package dhivya;
import java.util.*;
class Phone{
	String getname(String name)
	{
		return name;
	}
	long getphone(long phoneNumber)
	{
		return phoneNumber;
	}
}
public class Prog43 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Phone obj=new Phone();
		System.out.println("enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your phone number:");
		long phoneNumber=sc.nextLong();
		String  result=obj.getname(name);
	    long result1=obj.getphone(phoneNumber);
		System.out.println(result);
		System.out.println(result1);
	}

}
