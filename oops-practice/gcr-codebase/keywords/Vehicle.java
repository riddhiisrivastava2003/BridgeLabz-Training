import java.util.*;
class Vehicle{
   
    static double registrationFee = 150.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;



    Vehicle(String ownerName , String vehicleType , String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;


    }


    void displayvehicleDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
        System.out.println();

    }


    static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
    }

}

 class VehicleSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Registrations Fee: ");
        double fee = sc.nextDouble();

        sc.nextLine();

        Vehicle.updateRegistrationFee(fee);

       
        System.out.println("Enter Number of Vehicles : ");
        int numberOfVehicles = sc.nextInt();
        sc.nextLine();

        for(int i = 1 ; i <= numberOfVehicles; i++){
            System.out.println("\nEnter details of Vehicles - ");
            System.out.println("Owner Name : ");
            String ownerName =sc.nextLine();
            System.out.println("Vehicle type : ");
            String vehicleType= sc.nextLine();

            System.out.println("Registration Number : ");

            String registrationNumber = sc.nextLine();

            Vehicle vehicle = new Vehicle(ownerName , vehicleType, registrationNumber);

  
            if(vehicle instanceof Vehicle){
                vehicle.displayvehicleDetails();
            }
        }
        sc.close();

    }
}