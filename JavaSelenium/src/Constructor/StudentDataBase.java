package Constructor;

public class StudentDataBase {
	
	
	String SName;
	int id;
	static String CName;
	
	static
	{
		CName="Tagore";
	}
	
	public void studentDetails(String a, int b)
	{
		System.out.println("Student Name Is " + a);
		System.out.println("Student Id Is " + b);
		System.out.println("Student Collage Name Is " + CName);
		System.out.println("********************************************");
	}
	
	public static void main(String[] args) {
		
		StudentDataBase s = new StudentDataBase();
		s.studentDetails("Venkat", 101);
		s.studentDetails("Sathya", 104);
		s.studentDetails("Pavi", 108);
	}

}
