package polymorphism;

public class CalculatorDemo {
	
	final int var1=10;
	int var2=3;
	
	public void addNumbers()
	{
		System.out.println(("Addition is ") + (var1+var2));
	}
	
	
	public static void main(String[] args) 
	{
		
		CalculatorDemo c = new CalculatorDemo();
		
		//c.var1=100; // It will throw Error because we have declared as final var
		
		c.addNumbers();
		

}}
