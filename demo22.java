package java_learning;
import java.util.Scanner;
public class demo2 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int[] num=new int[5];
		System.out.println("Enter number:");

		for(int i=0;i<num.length;i++) {
			num[i]=scan.nextInt();
		}
	

		for(int result:num){
		//System.out.println("Enter number:");
		System.out.println(result);
		}
		
	}
}





