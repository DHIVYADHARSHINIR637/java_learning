package dhivya;
import java.util.*;
class Math{
	void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum:"+c);
	}
	void sub(int d,int e)
	{
		int f=d-e;
		System.out.println("Sub:"+f);
	}
	void mul(int g,int h)
	{
		int i=g*h;
		System.out.println("Mul:"+i);
	}
	void div(int j,int k)
	{
		int l=j/k;
		System.out.println("div:"+l);
	}
}

public class Prog37 {
	public static void main(String args[])
	{
	  Math obj=new Math();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number:");
	  int a=sc.nextInt();
	  System.out.println("Enter b number:");
	  int b=sc.nextInt();
	  obj.sum(a, b);
	  obj.sub(a,b);
	  obj.mul(a,b);
	  obj.div(a,b);
	}
}

	  
