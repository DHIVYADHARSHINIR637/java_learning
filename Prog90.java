package dhivya1;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Prog90 {
	public static void main(String args[])
	{
		try {
			
		FileReader fr=new FileReader("input.txt");
		int c =fr.read();
		System.out.println((char)c);
		fr.close();
	    }
		catch(Exception e)
		{
			
		}

}
}


