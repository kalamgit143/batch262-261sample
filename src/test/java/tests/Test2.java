package tests;

public class Test2
{
	public int add(int x, int y)
	{
		int z=x+y;
		return(z);
	}
	public int multiply(int x, int y)
	{
		int z=x*y;
		return(z);
	}
	public static int subtract(int x, int y)
	{
		int z=x-y;
		return(z);
	}
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		Test2 obj=new Test2();
		int z=obj.add(x, y); //calling non-static method
		System.out.println(z);
		z=Test2.subtract(x, y); //calling static method
		System.out.println(z);
	}
}
