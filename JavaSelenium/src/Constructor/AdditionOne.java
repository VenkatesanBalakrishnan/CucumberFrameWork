package Constructor;

public class AdditionOne {
	
	
	int var1;
	int var2;
	
	AdditionOne() // non parameterized cons
	{
		var1=10;
		var2=3;
		
	}
	AdditionOne(int a, int b) 
	{
		var1=a;
		var2=b;
		
	}
	
	public void addNumbers()
	{
		System.out.println("Addition is :"+ (var1+var2));
	}
	
	public static void main(String[] args) {
		AdditionOne a1 = new AdditionOne(20,50);
		AdditionOne a2 = new AdditionOne(20,80);
		AdditionOne a3 = new AdditionOne(100,50);
  
		a1.addNumbers();
		a2.addNumbers();
		a3.addNumbers();


		
	}
	

}


