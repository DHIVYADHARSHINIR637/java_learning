package java_learning;
import java.util.Scanner;
public class find {
	void evenorodd(int num)
	{
		if(num%2==0) {
			System.out.println(num +"is a even");
		}
		else
		{
			System.out.println(num +"is a odd");
		}
	}


public  static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=scan.nextInt();
	find f1=new find();
	f1.evenorodd(num);
	}

}
