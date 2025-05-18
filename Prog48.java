 package dhivya;
 import java.util.*;
 class Student3{
	String name;
	int age;
	int mark;
	Student3(String name,int age, int mark)
	{
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
	Student3 setMark(int mark)
	
	{
		this .mark=mark;
		return this;
		
	}
	void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("mark:"+this.mark);
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
public class Prog48 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your age:");
	    int age=sc.nextInt();
	    System.out.println("Enter your mark:");
		int mark=sc.nextInt();
		Student3 obj=new Student3(name,age,mark);
		obj.setMark(75).display();
		

	}

}
