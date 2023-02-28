package this_and_super_keyword;

public class demo2 extends demo1
{
	int B=55;
	
	public void m1()
	{
		int num1=this.B;
		System.out.println(num1);
		System.out.println(this.B);
		
		int num2=super.A;
		System.out.println(num2);
		System.out.println(super.A);
		
		System.out.println("---Addition of 2 numbers using this & super keywords---");
		System.out.println(super.A + this.B);
	}
	
	public static void main(String args [])
	{
		demo2 d=new demo2();
		d.m1();
	}
}
