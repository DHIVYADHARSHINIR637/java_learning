package java_learning;
import java.util.*;

public class Demo14 {
	public static void  printNumber(int...a)
	{
		for(int term:a)
		{
			System.out.println(term);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		printNumber(1,2,3,5,6);
		
	}
 }
