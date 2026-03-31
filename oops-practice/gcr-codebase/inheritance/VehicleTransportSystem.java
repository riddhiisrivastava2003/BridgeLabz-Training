import java.util.*;

class Vehicle{
	int maxSpeed;
	String fuelType;
	
	Vehicle(int maxSpeed,String fuelType){
	this.maxSpeed=maxSpeed;
	this.fuelType=fuelType;
	}
	
	void display() {
		System.out.println();
		System.out.println("max speed in kmph: "+maxSpeed);
		System.out.println("fuelType: "+fuelType);
	}
}

class Car extends Vehicle{
	int seatCapacity;
	Car(int maxSpeed,String fuelType, int seatCapacity){
		super(maxSpeed,fuelType);
		this.seatCapacity=seatCapacity;
	}
	
	@Override
	
	void display() {
		System.out.println("car details ");
		super.display();
		System.out.println("seat capacity "+seatCapacity);
	}
}
class MotorCycle extends Vehicle{
	boolean hasCarrier;
	MotorCycle(int maxSpeed,String fuelType, boolean hasCarrier){
		super(maxSpeed,fuelType);
		this.hasCarrier=hasCarrier;
	}
	
	@Override
	
	void display() {
		System.out.println("motorcycle details ");
		super.display();
		System.out.println("has carrier "+ (hasCarrier?"Yes":"No"));
		
		
	}
}
class Truck extends Vehicle{
	int loadCapacity;
	Truck(int maxSpeed,String fuelType, int loadCapacity){
		super(maxSpeed,fuelType);
		this.loadCapacity=loadCapacity;
	}
	
	@Override
	
	void display() {
		System.out.println("truck details ");
		super.display();
		System.out.println("load capacity "+loadCapacity);
	}
}

public class VehicleTransportSystem {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of vehicles");
		int n=sc.nextInt();
		
		sc.nextLine();
		
		Vehicle[] vehicle=new Vehicle[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter type(car/truck/motorcycle)");
			String type=sc.nextLine().toLowerCase();
			
			System.out.println("enter max speed");
			int speed=sc.nextInt();
			
			System.out.println("enter fuel type ");
			String fuel=sc.nextLine();
			
			switch (type) {
			case "car":
				System.out.println("enter seat capacity");
				int seat=sc.nextInt();
				sc.nextLine();
				vehicle[i]=new Car(speed,fuel,seat);
				
				break;
				
		
			case "truck":
				System.out.println("enter load capacity");
				int load=sc.nextInt();
				sc.nextLine();
				vehicle[i]=new Truck(speed,fuel,load);
				
				break;
			case "motorcycle":
				System.out.println("has carrier (true/false)");
				boolean hascarrier=sc.nextBoolean();
				sc.nextLine();
				vehicle[i]=new MotorCycle(speed,fuel,hascarrier);
				
				break;
				
				default:
					System.out.println("invalid input");
					i--;
				
			}
			
			
		}
		
		System.out.println("vehicle information");
		for(Vehicle v:vehicle) {
			v.display();
		}
	}

}
