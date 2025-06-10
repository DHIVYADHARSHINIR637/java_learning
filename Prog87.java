package dhivya;
class Calc{
	void div() throws Exception
	{
		int a=10/0;
	}
}
public class Prog87 {
	public static void main(String args[])
	{
		Calc c=new Calc();
		try {
		c.div();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
