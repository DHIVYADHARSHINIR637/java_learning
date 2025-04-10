package java_learning;
import java.util.*;
public class Demo5 {
	 
	    public static int factorial(int n)
	    {
	        int fact=1;
	        if(n>=2) {
	      
	            for(int i=2;i<=n;i++)
	            {
	                fact=fact*i;
	            }
	        }
	        return fact;
	       
	    }
	    public static int sumOfDigit(int g)
	    {
	    	int sum=0;
	    	while(g!=0)
	    	{
	    		sum=sum+g%10;
	    		g=g/10;
	    	}
	    	return sum;
	    }
	    
	 
	 public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n=sc.nextInt();
	    int g=sc.nextInt();
	    int factorials=factorial(n);
	    System.out.println("factorials="+factorials);
	    int sumofdigits=sumOfDigit(g);
	    System.out.println("sumofdigits="+sumofdigits);
	    //System.out.println(factorials);
	    

	 }


}
