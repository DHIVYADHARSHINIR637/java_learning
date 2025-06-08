package dhivya;
import java.util.*;
interface MathOperation{
	int operate(int a,int b);
}
public class Prog79 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MathOperation add=(a,b)->a+b;
		MathOperation sub=(a,b)->a-b;
		MathOperation mul=(a,b)->a*b;
		MathOperation div=(a,b)->{
			if(b==0)
			{
				System.out.println("Math error:divide by zero");
				return 0;
				
			}
			else
			{
				return a/b;
			}
		};
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition:"+add.operate(a,b));
		System.out.println("Subtraction:"+sub.operate(a,b));
		System.out.println("Mutiplication:"+mul.operate(a,b));
		System.out.println("Division:"+div.operate(a,b));
		
		
		
		
	}

}
