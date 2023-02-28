package CompileTime_Polymorphism;

public class demo1_method_overloading 
{
	public void Addition(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void Addition(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args)
	{
		demo1_method_overloading d1=new demo1_method_overloading();
		d1.Addition(50, 25);
		d1.Addition(50, 25, 20);
	}
}
