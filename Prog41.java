package dhivya;
import java.util.*;
class Largest{
	void findMax(int num1,int num2,int num3)
	{
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("Maximumn is:"+num1);
		}
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println("Maxinum is:" +num2);
		}
		else
		{
			System.out.println("Maxinum is:"+ num3);
		}
	}
}

public class Prog41 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Largest obj=new Largest();
		System.out.println("enter a num1:");
		int num1=sc.nextInt();
		System.out.println("Enter a num2:");
		int num2=sc.nextInt();
		System.out.println("Enter a num3 ");
		int num3=sc.nextInt();
		obj.findMax(num1,num2,num3);
	}

}
