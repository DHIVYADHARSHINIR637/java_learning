package dhivya;
import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
		
	}
}
class  AgeValidator {
	void checkAge(int age)
	{ 
		try {
		if(age<0 || age>1250) {
			
		
		  throw new InvalidAgeException("age is ivalid");
		}
		else {
			System.out.println("age is valid");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class  Prog86{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		AgeValidator e=new AgeValidator();
		e.checkAge(age);
		
	}

}
