package practiceAtOffice;

public class StringDemo {
	
	String s1 =("Oranium Tech");
	String s2=("Java Programing");//same address
	String s3= ("Java Programing");//same address
	String s4= ("No#19, Krishna street, Irumbuliyur, Chennai-600045");
	
	
	public void printString()
	{
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println("Pre defined String methods");
		
		System.out.println(s1.hashCode());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.contains("ran"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.equals("Oranium tech"));
		System.out.println(s1.equalsIgnoreCase("Oranium tech"));
		System.out.println(s1.endsWith("ch"));
		System.out.println(s1.startsWith("Oran"));
		System.out.println(s1.length());
		System.out.println(s2.trim());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("n"));
		System.out.println(s1.lastIndexOf("n"));
		System.out.println(s1.concat(" Session"));
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(0, 8));
		
	System.out.println("String using loops with charAt, tocharArray and Split methods");
		
	System.out.println("String using loops with charAt");
		
		for(int i=0; i<s1.length();i++)

		{
			System.out.print(s1.charAt(i));
		}
		System.out.println("String using loops with charAt-Reversal");

	for(int i=s1.length()-1;i>=0;i--)
		{
		System.out.print(s1.charAt(i));
		}
	
	System.out.println("Iterating Using toCharArray in normal forloop");
	
	char c[]=s4.toCharArray();
	
	for(int i=0;i<c.length;i++)
	
	{
		System.out.println(c[i]);
	}
	
	for(char k: c)
	{
		System.out.print(k);
	}
	
	System.out.println("Iterating Using Split in normal forloop");
	
	String str[]=s4.split(" ");
	
	for(int i=0;i<str.length;i++)
	
	{
		System.out.println(str[i]);
	}
	
	System.out.println("Iterating Using Split in enhanced forloop");
	
	for(String k : str)
	{
		System.out.println(k);
	}
	
	System.out.println(s2.trim().replace("Java", "C++"));
	System.out.println(s4.replaceAll("[A-Z]", ""));
	System.out.println(s4.replaceAll("[A-Z a-z]", " "));
	System.out.println(s4.replaceAll("[0-9]", ""));
	System.out.println(s4.replaceAll("[^0-9]", ""));
	
	}
	public static void main(String[] args) {
		
		StringDemo s = new StringDemo();
		s.printString();
	}

}
