import java.util.Scanner;
public class Demo8{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the income:");
        int  income=scan.nextInt();
        if(income>7000)
        {
            System.out.println("scholarship is avaiable");

        }
        else
        {
            System.out.println("not eligible for scholarship");
        }
    }
}
