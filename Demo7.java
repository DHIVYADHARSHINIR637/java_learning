import java.util.Scanner;
public class Demo7{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the mark:");
        int  mark=scan.nextInt();
        if(mark>35)
        {
            System.out.println("pass");

        }
        else
        {
            System.out.println("fail");
        }
    }
}
