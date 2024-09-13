package exceptionHandling;

public class CalculatorDemo {
	
	int var1= 10;
	int var2=0;
	String S1= null;
	int arr[] = {11,22,45,67};
	
	public void divisionDemo()
	{
		System.out.println("Hello Welcome to Code");
		try
		{
			System.out.println(arr[5]);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Found Null pointer Exception");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Found Arithmetic Exception");
		}
		
		catch(Exception e)
		
		{
			System.out.println("Not Listed Exception");
		}
		
		
		System.out.println("Code is in progress");
		System.out.println("You Are Successfully Achived");
		System.out.println("Thank you");
	}
	
	public static void main(String[] args) {
		
		CalculatorDemo c = new CalculatorDemo();
		
		c.divisionDemo();
	}

}
