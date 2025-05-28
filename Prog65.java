package dhivya;
interface Playable{
	void play();
}
class Guiter implements Playable{
	
	public void play()
	{
		System.out.println("play the music");
	}
}
class Piano implements Playable{
	public void play()
	{
		System.out.println("play the favarious song");
	}
	
}
public class  Prog65 {
	public static void main(String args[])
	{
		Piano obj1=new Piano();
		obj1.play();
		Guiter obj2=new Guiter();
		obj2.play();
	}

}
