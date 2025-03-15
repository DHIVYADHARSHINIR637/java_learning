import java.util.Scanner;
public class Demo12{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num:");
        int num=scan.nextInt();
        int factorial=1;
        int i=1;
        while(i<=num)
       {
         factorial=factorial*i;
         i++;
       }    
       System.out.println("factorial of " + num + "is:" + factorial);
     }

 }
