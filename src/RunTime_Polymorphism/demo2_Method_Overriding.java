package RunTime_Polymorphism;

public class demo2_Method_Overriding extends demo1_Method_Overriding
{
	public void Name() 
	{
		System.out.println("Ankit");
	}
	
	public void Surname()
	{
		System.out.println("Patil");
	}
	
	public void City()
	{
		System.out.println("Pune");
	}
	
	public static void main(String[] args) 
	{
		demo2_Method_Overriding d2=new demo2_Method_Overriding();
		d2.Name();
		d2.Surname();
		d2.City();
		d2.Country();
	}
}
