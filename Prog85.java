package dhivya;
import java.util.*;
class Division{

	public void divideNumber(int numerator,int denominator)
	{
		try {
			

		   int result=numerator/denominator;
		   System.out.println("Result:"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
		}
	}
}

	public class Prog85{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number n1:");
			int n1=sc.nextInt();
			System.out.println("Enter a number n2:");
			int n2=sc.nextInt();
			Division d=new Division();
			d.divideNumber(n1,n2);
		}
	}
	
