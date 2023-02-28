package LogicalPrograms1;

public class Sample15_Swap_2_Numbers_Without_using_3rd_Variable 
{
	public static void main(String[] args)
	{
		int num1=20;
		int num2=30;
		
		System.out.println("---Before Swapping---");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("---After Swapping---");
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}
	
}
