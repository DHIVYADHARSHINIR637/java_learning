import java.util.Scanner;
public class Demo11{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num:");
        int num=scan.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i=i+1)
       { 
        factorial=factorial*i;
       }    
       System.out.println("factorial of "+ num +"is:"+factorial);
     }

 }
