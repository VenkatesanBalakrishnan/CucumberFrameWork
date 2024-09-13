package practice;

public class ControlDemo {
	
	int num = 10;
	int num2 = 5;
	
	String proof="hh";
	
	public void controlDemo()
	{
		switch(proof) 
		{
		case "Pan":
		System.out.println(proof+ "is valid proof to open bank account");
		break;
		case "ration":
		System.out.println(proof+ "is valid proof to open bank account");
		break;
		case "voter Id":
		System.out.println(proof+ "is valid proof to open bank account");
		break;
		case "Aadhar":
		System.out.println(proof+ "is valid proof to open bank account");
		break;
		default:
		System.out.println("No vaild proof to open bank account");
		
		
		}
	}
	
	public static void main(String[]args)
	{
		ControlDemo c = new ControlDemo();
		c.controlDemo();
	}

}
