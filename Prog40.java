package dhivya;
import java.util.*;
class Number{
	void evenodd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+" is even number");
		}
		else
		{
			System.out.println(num+" is odd number");
		}
	}
}

public class Prog40 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Number obj=new Number();
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		obj.evenodd(num);
	}

}
