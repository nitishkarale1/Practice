package LogicalPrograms1;

public class Sample14_Swap_2_Numbers_using_3rd_Variable 
{
	public static void main(String[] args) 
	{
		int num1=200;
		int num2=400;
		int num3;
		
		System.out.println("---Before Swapping---");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		num3= num1;   //200
		num1=num2;    //400
		num2=num3;
		
		System.out.println("---After Swapping---");		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
	}
	
}
