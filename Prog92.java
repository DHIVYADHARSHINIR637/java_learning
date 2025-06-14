package dhivya1;
class A1 extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		{
		System.out.println("hi hello");
		try {
		Thread.sleep(10);
		}catch(Exception e){
			System.out.println(e);
		}
		}
		
	}
}
class B1 extends Thread{
public void run(){
	for(int i=0;i<10;i++){
		System.out.println("okay bye");
		try {
			Thread.sleep(10);
			}catch(Exception e){
				System.out.println(e);
			}
		}
}
}
public class Prog92 {
	public static void main(String args[]) {
		A1 obj=new A1();
		obj.start();
		B1 obj1=new B1();
		obj1.setPriority(10);
		obj1.start();
		
	}  
}



