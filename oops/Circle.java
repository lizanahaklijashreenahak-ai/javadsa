class Circle
{
	double radius;
	Circle(double r)
	{
		radius=r;
	}
	void area()
	{
		
		System.out.println("area="+3.14);
	}
}
class CircleTest
{
	public static void main(String[] args) 
	{
		Circle c = new Circle(6);
		c.area();
	}
}