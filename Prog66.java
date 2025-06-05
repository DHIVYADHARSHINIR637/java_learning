package dhivya;
import java.util.*;
class Mobile1{
	static String brand;
	static int price=1000;
	String name;
	static void display(String brand,int price)
	{
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
	}
}
public class Prog66 {
	public static void main(String args[])
	{
		//Mobile1 obj=new Mobile1();
		Scanner sc=new Scanner(System.in);
		System.out.println(("Enter a mobile brand:"));
		String brand=sc.nextLine();
		System.out.println("Enter a mobile price:");
		int price=sc.nextInt();
		String name=sc.nextLine();
		Mobile1.display(brand,100000);
		
		
	}

}
