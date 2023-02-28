package Logical_Programs;

public class sample42_CountDigitsInANumber 
{
	public static void main(String[] args) 
	{
		 int num=55443322;
		 int count=0;
		 
		 for(int i= num; i>0; i=i/10)
		 {
			 count++;     
		 }
		 System.out.println(count);
		 
//		 while(num>0)
//		 {
//			 num=num/10;
//			 count++;
//		 }
//		 System.out.println(count);
		 
//		 String num1=Integer.toString(num);
//		 for(int i=0; i<=num1.length()-1; i++)
//		 {
//			 //num1.charAt(i);
//			 count++;
//		 }
//		 System.out.println(count);
	}
	
}
