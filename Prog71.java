
package dhivya;

interface Bank{
	int rate=7;
	void calculate();
}
class Sbi  implements Bank{
	public void calculate()
	{
		int principal=1000;
		int time=2;
		int interest=(principal*rate*time)/100;
		System.out.println("interset frome sbi:"+interest);
	}
	
}

public class Prog71 {
	public static void main(String args[])
	{
		Sbi s=new Sbi();
		s.calculate();
	}

}
