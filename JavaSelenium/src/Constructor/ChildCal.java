package Constructor;

public class ChildCal extends FatherCal{
	
	
	int var1;
	int var2;
	
	ChildCal(int a, int b)
	{
		this(5.5,10);
		var1=a;
		var2=b;
		
		System.out.println("TWo Int para Addition is  " +(a+b));
	}
	
	ChildCal(double a, int b)
	{
		this(16,14.5);
		
		System.out.println("One double and one int para Addition is  " +(a+b));
	}
	ChildCal(int a, double b)
	{
		super(20,30);
		System.out.println("One int and One double para Addition is  " +(a+b));
	}
	
public static void main(String[] args) {
	
	ChildCal c = new ChildCal(100,400);
}
}
