package practiceAtOffice;

public class ArrayDemo {
	
	int arr[]= {22,35,64,43,89};
	
	
	public void printArray()
	{
		//System.out.println(arr);// Throw address
		//System.out.println(arr[2]);//64
		//System.out.println(arr[6]); // ArrayIndexOutOfBoundsException
		
		System.out.println("Itreating array using normal for loop");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("Reversing an array");
		
		for(int i=4;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Iterating array using enhanced for loop");
		
		for(int k : arr)
		{
			System.out.println(k);
		}
		
		System.out.println("Selective Itreating using normal for loop ");
		
		for(int i =4; i>=2;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("lenghth field");
		
		for(int i=0; i<arr.length ;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i= arr.length;i<=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		ArrayDemo a = new ArrayDemo();
		a.printArray();
	}
}
