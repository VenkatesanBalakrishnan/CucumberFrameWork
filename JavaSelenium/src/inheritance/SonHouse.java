package inheritance;

public class SonHouse extends FatherHouse{
	

	public void ktmBike()
	{
		System.out.println("This is Son's KTM Bike");
	}
	
	public void R15Bike()
	{
		System.out.println("This is Son's R15 Bike");
	}
	
	public static void main(String[] args) {
		
		SonHouse s = new SonHouse();
		
		s.ktmBike();// Son
		s.R15Bike(); // Son
		s.AudiCar();// Father
		s.inovaCar();//father
		s.ambassadorCar();// GrandFather
		s.bicycle();//Grandfather
	}

}
