package dhivya;
import java.util.*;
class Store{
	void getsoap(int money)
	{
		System.out.println(money);
		System.out.println("soap purchaseed");
	}
	void chocolate(int money)
	{
		System.out.println(money);
		System.out.println("chocolate purchased");
	}
	void powder(int money)
	{
		System.out.println(money);
		System.out.println("powder purchased");
	}
}
public class Prog36 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Store obj=new Store();
		System.out.println("Enter a money:");
		int money=sc.nextInt();
		obj.getsoap(money);
		obj.chocolate(money);
		obj.powder(money);
		
	}

}
