import java.util.*;
public class ValidationSystem{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqr1=sqr(n);
        int re1=reverse(n);
        int sqr2=sqr(re1);
        System.out.println((sqr1==sqr2)?"Vaild":"Invaild");
    }
        public static int sqr(int n1)
        {
            return n1*n1;
        }
        public static int reverse(int n)
        {
            StringBuilder se=new StringBuilder();
            se.append(n);
            se.reverse();
            String re=se.toString();
            return Integer.parseInt(re);
        }
    }
