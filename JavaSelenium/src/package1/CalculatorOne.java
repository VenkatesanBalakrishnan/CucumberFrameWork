package package1;

public class CalculatorOne {
	
	
	public void addNumbers()
	{
		System.out.println("Public  = Addition");
	}
	
	private void subNumbers()
	{
		System.out.println("private  = subNumbers");
	}
	
	protected void multiplyNumbers()
	{
		System.out.println("protected  = multiplyNumbers");
	}
	
	void dividNumbers()
	{
		System.out.println("defualt  = divisible");
	}
	
	public static void main(String[] args) {
		CalculatorOne c = new CalculatorOne();
		c.addNumbers();//public
		c.subNumbers();//private
		c.multiplyNumbers();//Protected
		c.dividNumbers();//default
	}
}
