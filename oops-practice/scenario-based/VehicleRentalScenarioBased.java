import java.util.*;


interface IRentable{
    double calculateRent(int days);
}



abstract class Vehicle implements IRentable{
    protected int vehicleId;
    protected String brand;
    protected double rentPerDay;



    Vehicle(int vehicleId, String brand, double rentPerDay){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }



    public abstract String getType();
    public void display(){
        System.out.println("ID :" + vehicleId + ", type: " + getType() + ", brand: " + brand + ", rent per day: " + rentPerDay);
    }
}


class Bike extends Vehicle{
    Bike(int vehicleId, String brand, double rentPerDay){
        super(vehicleId, brand, rentPerDay);
    }

    public String getType(){
        return "bike";
    }

    public double calculateRent(int days){
        return rentPerDay*days;
    }
}


class Car extends Vehicle{
    Car(int vehicleId, String brand, double rentPerDay){
        super(vehicleId, brand, rentPerDay);
    }

    public String getType(){
        return "car";
    }

    public double calculateRent(int days){
        return rentPerDay*days;
    }
}
class Truck extends Vehicle{
    Truck(int vehicleId, String brand, double rentPerDay){
        super(vehicleId, brand, rentPerDay);
    }

    public String getType(){
        return "truck";
    }

    public double calculateRent(int days){
        return rentPerDay*days;
    }
}


public class VehicleRentalScenarioBased {
    private static Scanner sc = new Scanner(System.in);
    private static List<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n----vehicle rental system----");
            System.out.println("1. add vehicle");
            System.out.println("2. view vehicles");
            System.out.println("3. update rent");
            System.out.println("4. delete vehicle");
            System.out.println("5. calculate rent");
            System.out.println("6. exit");

            System.out.print("choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addVehicle();
                case 2 -> viewVehicles();
                case 3 -> updateRent();
                case 4 -> deleteVehicle();
                case 5 -> calculateRent();
                case 6 -> {
                    System.out.println("thank you!");
                    return;
                }
                default -> System.out.println("invalid choice");
            }
        }
    }

    static void addVehicle() {
        System.out.print("enter vehicle type (bike/car/truck): ");
        String type = sc.next();
        System.out.print("enter vehicle ID: ");
        int id = sc.nextInt();
        System.out.print("enter brand: ");
        String brand = sc.next();
        System.out.print("enter rent per day: ");
        double rent = sc.nextDouble();

        Vehicle vehicle;
        switch (type.toLowerCase()) {
            case "bike" -> vehicle = new Bike(id, brand, rent);
            case "car" -> vehicle = new Car(id, brand, rent);
            case "truck" -> vehicle = new Truck(id, brand, rent);
            default -> {
                System.out.println("invalid vehicle type");
                return;
            }
        }
        vehicles.add(vehicle);
        System.out.println("vehicle added successfully");
    }


    static void viewVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("no vehicles available");
            return;
        }
        for (Vehicle v : vehicles) {
            v.display();
        }
    }   

    static void updateRent() {      
        System.out.print("enter vehicle ID to update rent: ");
        int id = sc.nextInt();
        for (Vehicle v : vehicles) {
            if (v.vehicleId == id) {
                System.out.print("enter new rent per Day: ");
                double newRent = sc.nextDouble();
                v.rentPerDay = newRent;
                System.out.println("rent updated successfully");
                return;
            }
        }
        System.out.println("vehicle not found");
    }

    static void deleteVehicle() {
        System.out.print("enter vehicle ID to delete: ");
        int id = sc.nextInt();
        Iterator<Vehicle> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            Vehicle v = iterator.next();
            if (v.vehicleId == id) {
                iterator.remove();
                System.out.println("vehicle deleted successfully");
                return;
            }
        }
        System.out.println("vehicle not found");
    }

    static void calculateRent() {

        System.out.print("enter vehicle ID to calculate rent: ");
        int id = sc.nextInt();
        for (Vehicle v : vehicles) {
            if (v.vehicleId == id) {
                System.out.print("enter number of days: ");
                int days = sc.nextInt();
                double totalRent = v.calculateRent(days);
                System.out.println("total rent for " + days + " days: " + totalRent);
                return;
            }
        }
        System.out.println("vehicle not found");
    }
}