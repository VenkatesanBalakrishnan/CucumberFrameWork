package polymorphism;


public class SonHouse extends FatherHouse {
	
	
	public void ktmBike()
	{
		System.out.println("This is Son's KTM Bike");
	}
	public void audiCar()
	{
		System.out.println("This is Son'Audi Car");
	}
	
	public static void main(String[] args) {
		
	
		
	SonHouse s = new SonHouse();
	s.ktmBike();
	s.audiCar();
	
	
		
	}

}