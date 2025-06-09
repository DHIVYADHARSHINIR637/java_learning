package dhivya;
import java.util.*;
public class Prog81 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number a:");
		int a=sc.nextInt();
		System.out.println("Enter a number b:");
		int b=sc.nextInt();
		try {
			int div=a/b;
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("program execution completed");
		}
	}

}
