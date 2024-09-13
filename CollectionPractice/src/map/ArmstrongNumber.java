package map;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the Number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		s.close();
		
		// 370 = 27+343+0 = 370
		// 370%10 = 0 --> it will return the reminder
		//370/10 =37  --> division
		//37%10= 7 
		
		int original =number;
		int temp;
		int check = 0;
		
		while(number>0)
		{
			temp = number%10; //0
			check=check+(temp*temp*temp); // 370 = 27+343+0 = 370
			number = number/10; // 370/10 =37
		}
		
		if(original == check)
		{
			System.out.println("It is a Armstrong Number");
		}
		else
		{
			System.out.println("It is not an Amstrong number");
		}
			
		}
		
	}


