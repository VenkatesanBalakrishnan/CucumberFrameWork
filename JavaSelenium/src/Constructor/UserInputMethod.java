package Constructor;

import java.util.Scanner;

public class UserInputMethod {
	
	String var1;
	String var2;
	
	public void addtionDemo()
	{
		Scanner s = new Scanner(System.in);
		
		//var1=s.nextInt();
		//var2=s.nextInt();
		
		var1=s.nextLine();
		var2=s.nextLine();
		
		System.out.println("Addion Is "+ (var1+var2));
	}
	
	public static void main(String[] args) {
		
		UserInputMethod u = new UserInputMethod();
		u.addtionDemo();
		
		
	}

}
