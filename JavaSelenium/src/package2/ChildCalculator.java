package package2;

import package1.*;

public class ChildCalculator extends CalculatorOne{
	
public static void main(String[] args) {
		
		ChildCalculator c = new ChildCalculator();
		
		c.addNumbers();//public
		//c.subNumbers();//private
		c.multiplyNumbers();//Protected
		//c.dividNumbers();//default

}
}
