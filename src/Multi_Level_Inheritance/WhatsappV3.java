package Multi_Level_Inheritance;

public class WhatsappV3 extends WhatsappV2
{
	public void videocalling()
	{
		System.out.println("Video Calling");
	}

	public static void main(String[] args)
	{
		WhatsappV3 V=new WhatsappV3();
		
		V.sms();
		V.audioCalling();
		V.videocalling();
	}
}
