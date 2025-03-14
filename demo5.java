
import java.io.*;
import java.util.Scanner;
public class demo5{
   public static void main(String[] args) {
   Scanner scan= new Scanner(System.in);
   System.out.println("Enter the integer:");
   int i = scan.nextInt();
   System.out.println("Enter the double:");
   double d=scan.nextDouble();
   scan.nextLine();
   System.out.println("Enter the String:");
   String s=scan.nextLine();
   System.out.println("String: " + s);
   System.out.println("Double: " + d);
   System.out.println("Int: " + i);
    }
} 
