package dhivya;
import java.util.*;
public class Prog80 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try {
			int a=sc.nextInt();
			int b=10/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("program end");
	}

}
