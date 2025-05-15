package dhivya;
class Student{
	int rollno;
	String name;
	int marks;
}
public class Prog28 {
	public static void main(String args[]){
		Student student1=new Student();
		student1.rollno=20;
		student1.name="dhivya";
		student1.marks=90;
		Student student2=new Student();
		student2.rollno=30;
		student2.name="deva";
		student2.marks=80;
		Student student3=new Student();
		student3.rollno=30;
		student3.name="tharanesswaren";
		student3.marks=80;
		Student[]  s1=new Student[3];
		s1[0]=student1;
		s1[1]=student2;
		s1[2]=student3;
		for(int i=0;i<s1.length;i++){
		 System.out.println(s1[i].name +" :"+s1[i].rollno);
		}
	}

}
