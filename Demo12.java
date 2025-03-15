import java.util.Scanner;
public class Demo12{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num:");
        int num=scan.nextInt();
        int sum=0;
        int i=1;
        while(i<=num)
       {
         sum=sum+i;
         i++;
       }    
       System.out.println("sum of n num:"+sum);
     }

 }
