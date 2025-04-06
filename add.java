package java_learning;
import java.util.Scanner;
public class add {
	void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("c:"+c);
	}
	void sum(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("d:"+d);
	}
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a:");
	int a=scan.nextInt();
	System.out.println("Enter b:");
	int b=scan.nextInt();
	System.out.println("Enter c:");
	int c=scan.nextInt();
	add a1=new add();
	a1.sum(a,b);
	a1.sum(a,b,c);
}
}

