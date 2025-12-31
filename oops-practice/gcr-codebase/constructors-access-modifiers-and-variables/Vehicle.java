
import java.util.Scanner;

class Vehicle {

	String ownerName ;
	String vehicleType;
	

	
	static double registrationFee = 1500;
	
	Vehicle(String ownerName , String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		
	}
	void displayVehicleDetails() {
		System.out.println("Owner Name : " + ownerName );
		System.out.println("Vehicle Type : " + vehicleType);
		System.out.println("Registration Fee : " + registrationFee);
		
		
	}
	static void updateRegistrationAmount(double newFee) {
		registrationFee = newFee;
		
	}
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Owner Name : ");
		String owner = sc.nextLine();
		System.out.println("Enter Vehicle Type: ");
		String type = sc.nextLine();
		System.out.print("Enter new Registration fee: ");
		double fee = sc.nextDouble();

        Vehicle.updateRegistrationAmount(fee);
		
		Vehicle vehicle = new Vehicle(owner , type);
		vehicle.displayVehicleDetails();
	}

}