import java.util.Scanner;
class Sixteen
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int no1=sc.nextInt();
		System.out.println("enter second number");
		int no2=sc.nextInt();
		System.out.println("enter third number");
		int no3=sc.nextInt();
		System.out.println("enter fourth number");
		int no4=sc.nextInt();
		System.out.println("enter fifth number");
		int no5=sc.nextInt();
		int s=no1+no2+no3+no4+no5;
		System.out.println("add="+s);
	}
}