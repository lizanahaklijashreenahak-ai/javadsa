class Rectangle
{
	int length,breadth;
	Rectangle(int l, int b)
	{
	length=l;
	breadth=b;
	}
	void area()
	{
	System.out.println("area of rectangle="+length*breadth);
	}
}
class RectangleTest
{
	public static void main(String arg[])
	{
		Rectangle r = new Rectangle(5,8);
		r.area();
	}
}