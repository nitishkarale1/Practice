package Abstract_Concrete_class;

public class demo2_ConcreteClass extends demo1_AbstractClass
{
	public void Surame()
	{
		System.out.println("Karale");		
	}
	
	public void City() 
	{
		System.out.println("Aurangabad");
	}	
	
	public static void main(String[] args) 
	{
		demo2_ConcreteClass d2=new demo2_ConcreteClass();
		d2.Name();
		d2.Surame();
		d2.City();
	}
}
