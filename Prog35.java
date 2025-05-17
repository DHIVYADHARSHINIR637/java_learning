package dhivya;
import java.util.*;
class Graden{
	int apple_price;
	int  apple_count;
	void total_money(int apple_price,int apple_count)
	{
		int c=apple_price*apple_count;
		System.out.println("Result:"+c);
	}
	
}

public class Prog35 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Graden obj=new Graden();
		System.out.println("Enter a price:");
		int apple_price=sc.nextInt();
		System.out.println("Enter a count:");
		int apple_count=sc.nextInt();
		obj.total_money(apple_price, apple_count);
	}

}
