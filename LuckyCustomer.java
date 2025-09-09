import java.util.*;
public class LuckyCustomer{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        if(n==1 || n==2)
        {
            System.out.println(1);
        }
        else
        {
        for(int i=3;i<=n;i++)
        {
            int next=a+b;
            a=b;
            b=next;
        }
        System.out.println("Lucky Customer order Id is"+" "+b);
        }

    }
}
