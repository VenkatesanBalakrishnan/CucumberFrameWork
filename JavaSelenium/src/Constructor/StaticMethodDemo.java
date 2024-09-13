package Constructor;

public class StaticMethodDemo {
	
	static
	{
		System.out.println("Hi I'm Static block");
	}
	
	
	public void addNumbers()
	{
		System.out.println("Hi I'm Instance Method");
	}
	
	 public static void subNumbers()
	{
		System.out.println("Hi I'm Static Method");
	}
	
	public static void main(String[] args) {
		
		StaticMethodDemo s = new StaticMethodDemo();
		s.addNumbers();
		StaticMethodDemo.subNumbers();
	}
	

}
