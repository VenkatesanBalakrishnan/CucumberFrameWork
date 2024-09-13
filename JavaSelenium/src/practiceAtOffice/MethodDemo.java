package practiceAtOffice;

public class MethodDemo {
	
	int var1 =10;
	int var2=3;
	
	public void addNumber()
	{
		System.out.println("Addition is "+ (var1+var2)); // M WOR and WOP
	}
	
	public void subNumer(int a, int b)
	{
		System.out.println("subtraction is " +(a-b)); // M WOR and WP
	}
	
	public int multiplication() // M WR and WOP
	{
		return var1*var2;
	}
	
	public int division(int a, int b) // M WR and WP
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		
		MethodDemo m = new MethodDemo();
		
		m.addNumber();
		m.subNumer(500,300);
		System.out.println(m.multiplication());
		System.out.println(m.division(20, 2));
	}
	

}
