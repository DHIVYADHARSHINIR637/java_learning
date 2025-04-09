import java.util.*;
class Main25{
    public static void main(String args[])
    {
        int n,sum,product,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        sum=0;
        product=1;
        while(n != 0)
        {
            a=n%10;
            sum+=a;
            product*=a;
            n=n/10;
        }
        if(sum==product)
        {
            System.out.println("it is a spy number");
        }
        else{
            System.out.println("not a spy number");

        }
    }
}
