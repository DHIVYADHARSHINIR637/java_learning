package dhivya;
import java.util.*;
class School{
	String passorfail(int num)
	{
		if(num<35)
		{
			
		
		return "fail";
		}
		else
		{
			return "pass";
		}
	}
	
}

public class Prog44 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		School obj=new School();
		System.out.println("Ente a mark:");
		int  total_mark=sc.nextInt();
		String  result=obj.passorfail(total_mark);
		System.out.println(result);
	}
}
