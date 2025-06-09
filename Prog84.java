package dhivya;
import java.util.*;
class NotValidException extends Exception{
	public NotValidException(String s) {
		super(s);
	}
}
public class Prog84 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try {
			int age=sc.nextInt();
			if(age<18)
			{
				throw new NotValidException("your ge should be above 18");
			}
		}
		catch(NotValidException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
