package practice;

public class LoopsDemo {
	
	int num = 1;
	int num2 =10;
	int mind =0;
	
	public void printNumber()
	{
		while(num<=100)
		{
			System.out.println(num);
			num++;
		}
	}
	
	public void printtable()
	{
		do
		{
			System.out.println((num)+" * 2 = "+ num*2);
			num++;
		}while(num<=10);
	}
	
	public void printsum()
	{
		while(num<=5)
		{
			mind = mind+num;
			num++;
			
		}System.out.println(mind);
	}
		public void printoddEven()
		{
			while(num<=100)
			{
				if(num%2==0)
				{
					System.out.println(num +" Even Number");
				}
			else
			{
				System.out.println(num +" Odd Number");
			}
				num++;}
			}
			
			public void printStar()
			{
				for(int col =1; col<5;col++)
				{
					System.out.print("*1");
					for(int row =1; row<5;row++)
					{
						System.out.print("*1");
					}
					System.out.println();}
				}
				
				public void printSquareStar()
				{
					for(int row=1; row<=5;row++)
					{
						for(int col=1; col<=5;col++)
						{
							if(row==1|| row==5||col==1||col==5)
							{
								System.out.print("*1");
								}
							
							else {
								System.out.print("  ");
							}
						}System.out.println();
						
					}
			}
			
	
	
	public static void main(String[] args) {
		LoopsDemo l = new LoopsDemo();
		//l.printNumber();
		//l.printtable();
		//l.printsum();
		//l.printoddEven();
		  //l.printStar();
		l.printSquareStar();
	}

}
