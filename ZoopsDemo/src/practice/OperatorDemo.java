package practice;

public class OperatorDemo {
	
	int Var1 = 1;
	int Var2 = 20;
	
	public void arithmeticOps()
	{
		System.out.println(Var1+Var2);
		System.out.println(Var1-Var2);
		System.out.println(Var1*Var2);
		System.out.println(Var1/Var2);
		System.out.println(Var1%Var2);
	}
	
	public void reletinalOps()
	{
		System.out.println(Var1>Var2);//f
		System.out.println(Var1<Var2);//t
		System.out.println(Var1>=Var2);//f
		System.out.println(Var1<=Var2);//t
		System.out.println(Var1==Var2);//f
		System.out.println(Var1!=Var2);//t
	}
	public void logicalOps()
	{
		System.out.println(Var1>Var2 && Var1!=Var2);//f
		System.out.println(Var1<Var2 || Var1>=Var2 );//t
		System.out.println(Var1!=5);//t
		
	}
	public void InDecOps()
	{
		Var1++;
		Var2--;
		System.out.println(Var1+Var2);
		++Var1;
		--Var2;
		System.out.println(Var1+Var2);
	}
	
	public void assingOps()
	{
		Var1=15;
		System.out.println(Var1);
	}
	
	public void shorthandOps()
	{
		Var1*=Var2;
		
		System.out.println(Var1);
	}
	
	public void conditionalOps()
	{
		System.out.println((Var2<18)?"Eligible for Vote" : "Not Eligible for Vote");
	}
	
	public static void main (String[]args)
	{
		OperatorDemo o = new OperatorDemo();
		o.arithmeticOps();
		o.reletinalOps();
		o.logicalOps();
		o.InDecOps();
		o.assingOps();
		o.shorthandOps();
		o.conditionalOps();
	}

}
