package dhivya;

interface Printable
{
	void display();
}
interface Showable
{
	void display();
}
class Document implements Printable,Showable
{
	public void display()
	{
	  System.out.println("this for mutiple inheritance");
	}
}
public class Prog73 {
	public static void main(String args[]) {
		Document d=new Document();
		d.display();
	}

}
