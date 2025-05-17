package dhivya;
import java.util.*;
class SquareNumber{
	void square(int num)
	{
		int c=num*num;
		System.out.println("Square is:"+c);
	}
	
}
public class Prog39 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		SquareNumber obj=new SquareNumber();
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		obj.square(num);
	}

}
