package java_learning;
import java.util.Scanner;
public class school {
	String passorfail(int  mark)
	{
		if(mark>35)
		{
			return "pass";
		}
		else {
			
			return "fail";
		}
	
}
public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the mark:");
		int total_mark=scan.nextInt();
		school s1=new school();
		String result=s1.passorfail(total_mark);
	    System.out.println(result);

}
}

