package dhivya;
class Students1{
	 String name;
	 int  rollno;
	 static int count=0;
	 Students1(String name,int rollno)
	 {
		 this.name=name;
		 this.rollno=rollno;
		 count++;
	 }
	 void display()
	 {
		 System.out.println("Name:"+name);
		 System.out.println("Rollno:"+rollno);
		
	 } 
	 static void showCount()
	 {
	  System.out.println("Total number of student created:"+count);
	 }
	 
}
public class Prog58
{
	public static void main(String[] args)
	{
		Students1 obj1=new Students1("dhivya",20);
		Students1 obj2=new Students1("deva",22);
		Students1 obj3=new Students1("tharaness",19);
		obj1.display();
		obj2.display();
		obj3.display();
		Students1.showCount();
		
	}
	
}
	 


