import java.util.Scanner;
class demo16{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scan.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("it is  an even number");
        }
        else
        {
            System.out.println("it  is an odd number" );
        }
        scan.close();
    }
}
