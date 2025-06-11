package dhivya1;

import java.io.FileReader;
import java.io.BufferedReader;
public class Prog91 {
	public static void main(String args[])
	{
		try {
			FileReader fr=new FileReader("ouput.text");
			BufferedReader br=new BufferedReader(fr);
			String s=br.readLine();
			while(s!=null)
			{
				System.out.println(s);
				s=br.readLine();
			}
		}catch(Exception e)
		{
			
		}
	}

}
