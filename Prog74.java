package dhivya;
interface Camera{
	void takePhoto();
}
interface MusicPlayer{
	void playMusic();
}
class SmartPhone implements Camera,MusicPlayer
{
	public void takePhoto()
	{
		System.out.println(" Photo taken using smartphone");
	}
	public void playMusic()
	{
		System.out.println(" Music is playing on smartphone");
	}
}
public class  Prog74 {
	public static void main(String args[])
	{
		
		
		Camera c=new SmartPhone();
		c.takePhoto();
		MusicPlayer m=new SmartPhone();
		m.playMusic();
	}

}
