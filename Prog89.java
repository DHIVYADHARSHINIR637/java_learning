package dhivya1;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Prog89 {
	public static void main(String args[])
	{
		try {
		FileWriter fw=new FileWriter("ouput.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hi dhivya");
		bw.newLine();
		bw.write("home");
		bw.close();
		System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
