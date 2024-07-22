/*
Author Name:- Devanand Nana Farkade 
Batch :- J-56
Title :- write a program for interfaces.  
*/


public class InterfaceExVEhicle{
	public static void main(String []args){
		Bike b=new Bike();
		System.out.println(b.licenseRequired());
		OnEarth.areYouOnEarth();			//we can call this using interface name
		Car c=new Car();
		System.out.println(c.licenseRequired());

		AirPlane a=new AirPlane();
		System.out.println( a.isHePilot());
	}
	
}

interface OnEarth {
	static void areYouOnEarth(){				// we can call this using interface name
		System.out.println("this is on earth ");
	}
}
 interface ByRoad extends OnEarth{
	private void licenseRequired(){	
	};

}
interface ByAir extends OnEarth{
	public boolean isHePilot();

}

class Vehicle {
	
}
class AirPlane extends Vehicle implements ByAir{
	public boolean isHePilot(){
		System.out.print("He is a PILOT = ");
		return true;
	}
}
class Bike extends Vehicle implements ByRoad{
	
	public boolean licenseRequired(){
		System.out.print("is he BIKE license = ");

		return true;
	}
	
	
	
	
}
class Car extends Vehicle implements ByRoad {
	public boolean licenseRequired(){
		System.out.print("is he CAR license = ");
		return true;
	}
	
}
