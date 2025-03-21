import java.util.Scanner;
public class demo17{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your marks out of 100:");
        int marks=scan.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println("your grade is:A");
        }
        else if(marks >= 80 && marks <= 90){
            System.out.println("your grade is:B");
        }
        else if(marks >= 70 && marks <= 80){
            System.out.println("your grade is:C");
        }
        else if(marks >= 60 && marks <= 70){
            System.out.println("your grade is:D");
        }
        else if(marks <=60  && marks <= 0){
            System.out.println("Fail");
        }
        else{
            System.out.println("invalid matks!");
        }
    }
}
