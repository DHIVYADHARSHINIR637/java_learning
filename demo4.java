import java.util.Scanner;
public class demo4{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the signal color:");
        String traffic=scan.nextLine();
        switch(traffic)
        {
         case "red":
            System.out.println("stop!");
            break;
         case "yellow":
            System.out.println("get ready!");
            break;
        case "green":
            System.out.println("go!");
         default:
            System.out.println("invalid syntax");  

        }

    }
}
