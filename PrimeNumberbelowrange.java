import java.util.*;
public class PrimeNumberbelowtherange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<=num;i++)
        {
            boolean isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0)
            {
                isprime=false;
                break;
            }
          }
          if(isprime)
           {
            System.out.print(i+" ");
            }
        }
    }
}
