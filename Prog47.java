package dhivya;

import java.util.Scanner;
class Student2{
	 String name;
	 int age;
	 int mark;
	 Student2(String name,int age,int mark)
	 {
		this.name=name;
		this.age=age;
		this.mark=mark;
	 }
	 void display()
	 {
		System.out.println("Name:"+ this.name);
		System.out.println("Age:"+ this.age);
		System.out.println("Mark:"+this.mark);
		if(mark>=35)
		{
			System.out.println("pass"); 
		}
		else
		{
			System.out.println("fail");
		}
		
	 }
	  
 }
public class Prog47 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter your mark:");
		int mark=sc.nextInt();
		Student2 obj=new Student2(name,age,mark);
		Student2 obj2=new Student2("Deva",22,78);
		obj.display();
		obj2.display();

	}

}

