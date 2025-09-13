import java.io.*;
import java.util.Scanner;
public class Staticblock {
        static int B=1;
        static int H=3;
        static boolean  flag=true;
        static{
            Scanner sc=new Scanner(System.in);
            B=sc.nextInt();
            H=sc.nextInt();
            if(B<=0 || H<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag=false;
            }
        }
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

