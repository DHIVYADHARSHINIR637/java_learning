import java.util.*;
class Recursion3{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("fibonacci series up to"+" "+ n +" "+ "terms");
        for(int i=0;i<n;i++){
        System.out.print(fibo(i)+" ");
        }
    }
    static int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
        
    }
}
