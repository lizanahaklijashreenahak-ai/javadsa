import java.util.Scanner;
class Three
{
	public static void main(String arg[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number ");
	    int no=sc.nextInt();
	    if(no<0)
	    {
	       no=-no;
	     }
	     System.out.println(no);
	}
}