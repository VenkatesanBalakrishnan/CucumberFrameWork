package Constructor;

public class AdditionDemo {
	
	int var1;
	int var2;
	
	
	AdditionDemo()//Non parameterised constructor
	{
		this(20,30);
		
		var1=10;
		var2=4;
		System.out.println(("Addition is + ") + (var1+var2));
	}
	
	AdditionDemo(int a, int b) // 
	{
		this(10.5, 5);
		
		System.out.println(("two int para Is + ") + (a+b));
	}
	
	AdditionDemo(double a, int b) // 
	{
		this(5, 20.5);
		System.out.println(("one double and one int para Is + ") + (a+b));
	}
	
	AdditionDemo(int a, double b) // 
	{
		System.out.println(("one int and one double para Is + ") + (a+b));
	}
	
	
	
	public static void main(String[] args) {
		
		AdditionDemo a1 = new AdditionDemo();
		

	}

}
