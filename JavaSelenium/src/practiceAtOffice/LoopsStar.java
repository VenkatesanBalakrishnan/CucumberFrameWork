package practiceAtOffice;

public class LoopsStar {
	
	
	
	public void printStar()
	{
		for(int row =1; row<=5;row++)
		{
			for(int col =1; col<=5;col++)
			{
				System.out.print("1*");
			}
			System.out.println();
		}
	}
	
	public void printSquare()
	{
		for(int row=1; row<=5;row++)
		{
			for(int col=1; col<=5;col++)
			{
				if(row==1||row==5||col==1||col==5)
				{
					System.out.print("*1");
				}
				else
				{
					System.out.print("  ");
				}
		
			}
			{
			
			System.out.println();
			}}}
		
		
			
	public static void main(String[] args) {
		LoopsStar l = new LoopsStar();
		//l.printStar();
		l.printSquare();
		
	}
	

}