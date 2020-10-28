package actJava;

public class Car {
	
	String carColor;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	
	public Car() {
		
		tyres = 4;
		doors = 4;
		
	}
	
	public void displayCharcteristics()
	{
		System.out.println("Color of car is: " +carColor );
		System.out.println("transmission of car is: " +transmission );
		System.out.println("make of car is: " +make );
		System.out.println("tyres of car is: " +tyres );
		System.out.println("doors of car is: " +doors );
		
	}
	
	public void accelerate() {
		System.out.println("Car is Moving forward");
	}

	public void brake()
	{
		System.out.println("Car has stopped");
	}
}
