package dhivya;
interface Shape
{
	void draw();
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing a circle");
	}
}
class Rectangle implements Shape{
	public void draw()
	{
		System.out.println("Drawing a rectangle");
	}
}
class Triangle implements Shape{
	public void draw()
	{
		System.out.println("Drawing a triangle");
	}
}
public class Prog70 {
	public static void main(String args[])
	{
		/*Triangle t=new Triangle();
		t.draw();
		Rectangle r=new Rectangle();
		r.draw();
		Circle c=new Circle();
		c.draw();*/
		Shape[] shapes= {new Circle(),new Rectangle(),new Triangle()};
		for(Shape s:shapes)
		{
			s.draw();
		}
	}

}
