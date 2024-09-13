package inheritance;

public class DaughterHouse extends FatherHouse{
	
	public void scootypep()
	{
		System.out.println("This is Daughter's Scootype");
	}
	public void ladybird()
	{
		System.out.println("This is Daughter's Ladybird Cycle");
	}
	
public static void main(String[] args) {
	
	DaughterHouse d = new DaughterHouse();
	d.scootypep();//DaughterHouse
	d.ladybird();//DaughterHouse
	d.AudiCar();//Father
	d.inovaCar();//Father
	d.ambassadorCar();// GrandFather
	d.bicycle();// GrandFather
}
}
