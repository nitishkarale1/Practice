package Single_Level_Inheritance;

public class demo4 extends demo3
{	
	public void m3()
	{
		System.out.println("home: 3bhk");
	}
	
	public void m4()
	{
		System.out.println("mobile: OnePlus");
	}
	
	public static void main (String [] args)
	{
		demo4 d=new demo4();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}
}
