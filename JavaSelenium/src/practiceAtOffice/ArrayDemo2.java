	package practiceAtOffice;
	
	public class ArrayDemo2 {
		
		int arr[]= {22,77,99,76,44};
		int tarr[][]= {{22,33,44},
				       {55,66,77,88},
				       {88,99,11}};
		
		
	public void printArray()
	{
		System.out.println(tarr[1][1]);//66
		System.out.println(tarr.length);//3
		
		System.out.println("Iterating 2D array using normal for loop");
		
		for(int row =0; row<tarr.length;row++)
		{
			for(int col =0; col<tarr[row].length; col++)
			{
				System.out.print(tarr[row][col]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Iterating 2D Array using enhanced for loop");
		
		for(int k[] : tarr)
		{
			for(int l:k)
			{
				System.out.print(l+ " ");
			}System.out.println();
		}
		
		}
	
	public static void main(String[] args) {
		ArrayDemo2 a = new ArrayDemo2();
		a.printArray();
	}
	
	}
