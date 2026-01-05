import java.util.*;

interface GPS{
    String getCurrentLocation();
    void updateLocation(String newLocation);
}


abstract class Vehicle implements GPS{

    private int vehicleId;
    private String driverName;
    protected double ratePerKm;
    private String currentLocation;


    public Vehicle(int vehicleId, String driverName, double ratePerKm){
        this.vehicleId=vehicleId;
        this.driverName=driverName;
        this.ratePerKm=ratePerKm;
        this.currentLocation="unknown";



    }


    public abstract double calculateFare(double distance);

    public void getVehicleDetails(){

        System.out.println("vehicle id: "+vehicleId);
        System.out.println("driver name: "+driverName);
        System.out.println("current location: "+currentLocation);
        System.out.println("rate per km: "+ratePerKm);


    }


    @Override
    public String getCurrentLocation(){
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation){
        this.currentLocation=newLocation;
    
    }

}


class Car extends Vehicle{
    public Car (int id, String driverName){
        super(id,driverName,20.0);//car ka rate per km 20 hai
    }

    @Override
    public double calculateFare(double distance){
        return distance*ratePerKm;
    }
}

class Bike extends Vehicle{
    public Bike (int id, String driverName){
        super(id,driverName,10);// bike ka rate per km 10 dala
    }

    @Override

    public double calculateFare(double distance){
        return distance*ratePerKm;
    }
}

class Auto extends Vehicle{

    public Auto(int id,String driverName){
        super(id,driverName,8);
    }

    @Override

    public double calculateFare(double distance){
        return distance*ratePerKm;
    }
}


public class RidingApp{

    public static void calculateRidingFare(Vehicle vehicle, double distance){
        vehicle.getVehicleDetails();
        System.out.println("distance in km: "+distance);
        System.out.println("fare: "+vehicle.calculateFare(distance));
        System.out.println();
    }


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        List<Vehicle> vehicles=new ArrayList<>();

        System.out.println("enter number of rides");
        int n=sc.nextInt();
        sc.nextLine();


        for(int i=0;i<n;i++){
            System.out.println("enter ride details for ride nummber "+(i+1) );

            System.out.println("vehicle id: ");
            int id=sc.nextInt();

            sc.nextLine();

            System.out.println("driver name: ");
            String driver=sc.nextLine();

            System.out.println("vehicle type(1-car, 2-bike, 3-auto)");
            int type=sc.nextInt();

            sc.nextLine();


            Vehicle vehicle;


            if(type==1){
                vehicle=new Car(id,driver);


            }
            else if(type==2){
                vehicle=new Bike(id,driver);

            }else{
                vehicle=new Auto(id, driver);
            }


            sc.nextLine();


            System.out.println("current location: ");
            String location=sc.nextLine();
            vehicle.updateLocation(location);

            vehicles.add(vehicle);
        }

        System.out.println("enter distance");
        double distance=sc.nextDouble();

        System.out.println("ride fare details");
        for(Vehicle v:vehicles){
            calculateRidingFare(v,distance);
        }

    }


}