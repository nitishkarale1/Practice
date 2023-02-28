package UpCasting;

public class demo2 extends demo1
{
	public void Mobile()
	{
		System.out.println("Mobile: OnePlus");
	}
	
	public void Car()
	{
		System.out.println("Car: Audi");
	}
	
	public void Money() 
	{
		System.out.println("Money: 8Lacs");
	}
	
	public static void main(String[] args) 
	{
		demo1 d1=new demo2();
		d1.Car();
		d1.Money();
		d1.Home();
	}
}
