package dhivya;
class Student1{
	 String name;
	 int age;
	 Student1(String name,int age)
	 {
		this.name=name;
		this.age=age;
	 }
	 void display()
	 {
		System.out.println("Name:"+ this.name);
		System.out.println("Age:"+ this.age);
		
	 }
	  
  }
public class Prog46 {

	public static void main(String[] args) {
		Student1 obj=new Student1("dhivya",19);
		Student1 obj2=new Student1("Deva",22);
		obj.display();
		obj2.display();

	}

}
