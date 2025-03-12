import java.util.Scanner;
public class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("===============");
        for(int i=1;i<=3;i=i+1)
        {
            String s1=scan.nextLine();
            int n1=scan.nextInt();
            System.out.printf("%-15s%03d%n",s1,n1);
            scan.nextLine();
        }
        System.out.println("===============");
    }
}
