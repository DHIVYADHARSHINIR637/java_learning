package dhivya;
import java.util.*;
class Addition{
	int a;
	int b;
	void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Result:"+c);
	}
}

public class Prog34 {
	public static void main(String args[])
	{
		Addition obj=new Addition();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter b number:");
		int b=sc.nextInt();
		obj.sum(a, b);
		
	}

}
