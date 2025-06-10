package dhivya;
import java.io.FileWriter;
public class Prog88 {
	public static void main(String args[])
	{
		try {
		FileWriter fw=new FileWriter("output.text");
		fw.write("hello world");
		fw.append("heey");
		fw.close();
		System.out.println("success");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}

