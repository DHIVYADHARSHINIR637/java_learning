package dhivya;
interface Playable1{
	void play();
}
class Guiter1 implements Playable1{
	public void play()
	{
		System.out.println("play the guiter");
	}
	
}
class Piano1 implements Playable1{
	public void play()
	{
		System.out.println("play the piano");
	}
}

public class Prog68 {
	public static void main(String args[])
	{
		Piano1 obj=new Piano1();
		obj.play();
		Guiter1 obj1=new Guiter1();
		obj1.play();
	
	}

}
package dhivya;
interface Playable1{
	void play();
}
class Guiter1 implements Playable1{
	public void play()
	{
		System.out.println("play the guiter");
	}
	
}
class Piano1 implements Playable1{
	public void play()
	{
		System.out.println("play the piano");
	}
}

public class Prog68 {
	public static void main(String args[])
	{
		Piano1 obj=new Piano1();
		obj.play();
		Guiter1 obj1=new Guiter1();
		obj1.play();
	
	}

}
