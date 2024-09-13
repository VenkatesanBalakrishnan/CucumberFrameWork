package practiceAtOffice;

public class FirstProgram {
	
	int var1 = 10;
	int var2 = 3;
	public void addNumbers()
	{
		System.out.println ("Addision is :" + (var1+var2));
		
		
	}
	public void subNumber()
	{
		System.out.println ("Subtraction is :" + (var1-var2));
		
	}
	public void multiplyNumber()
	{
		System.out.println ("Multiplication is :" + (var1*var2));
		
		
	}
	public void divisionNumber()
	{
		System.out.println ("Division is :" + (var1/var2));
		
	}
	public static void main (String[] args)
	{
	
		FirstProgram F = new FirstProgram();
		F.addNumbers();
		F.subNumber();
		F.multiplyNumber();
		F.divisionNumber();

	
	}
	
	
}
