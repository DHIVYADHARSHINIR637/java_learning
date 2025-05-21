package dhivya1;

public class Student {
	public String name;
	private int rollnumber;
	protected String department;
	 int age;
	public void setDetails(String name)
	{
		this.name=name;
		
	}
	private void displayRoll(int rollnumber)
	{
		this.rollnumber=rollnumber;
		System.out.println("RollNumber:"+rollnumber);
	}
	protected void displayDept(String department)
	{
		this.department=department;
		System.out.println("Department:"+department);
	}
	void displayAge(int age)
	{
		this.age=age;
		System.out.println("Age:"+age);
	}
	public void displayAll()
	{
		System.out.println("Name:"+name);
		displayAge(20);
		displayDept("cse");
		displayRoll(30);
	}

}
package dhivya1;

public class College {
	public static void main(String args[])
	{
		Student s1=new Student();
		
		s1.setDetails("dhivya");
		s1.displayAll();
	}

}
