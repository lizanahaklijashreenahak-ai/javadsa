class Square
{
	int length;
	Square(int l)
	{
	length=l;
	}
	void area()
	{
	System.out.println("area of Square="+length);
	}
}
class SquareTest
{
	public static void main(String arg[])
	{
	Square s=new Square(6);
	s.area();
	}
}