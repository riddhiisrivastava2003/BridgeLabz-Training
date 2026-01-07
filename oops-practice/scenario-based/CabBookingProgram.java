
import java.util.*;


class NoDriverAvailableException extends Exception{
    public NoDriverAvailableException(String msg){
        super(msg);
    }
}



//interface 
interface FareCalculator{
    double calculateFare(double distance);
}




//polymorphism 
class NormalFareCalculator implements FareCalculator{
    public double calculateFare(double distance){
        return distance * 10;
    }
}



class PeakFareCalculator implements FareCalculator{
    public double calculateFare(double distance){
        return distance * 15;

    }
}




//user class 
class User{
    int userId;
    String name;
    User(int userId, String name){
        this.userId = userId;
        this.name = name;
    }
}


//driver class
class Driver{
    int driverId;
    String name;
    boolean available =true;



    Driver(int driverId, String name){
        this.driverId = driverId;
        this.name = name;
    }
}



//ride class 
class Ride{
    
    int rideId;
    User user;
    Driver driver;
    double fare;

    Ride(int rideId, User user, Driver driver, double fare) {
        this.rideId = rideId;
        this.user = user;
        this.driver = driver;
        this.fare = fare;
    }

}




//main class
public class CabBookingProgram{
    static Scanner sc= new Scanner(System.in);
    static ArrayList<Driver> drivers = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Ride> rides = new ArrayList<>();







    // CRUD
    static void addUser(){
        System.out.print("enter user id:");
        int id = sc.nextInt();


        sc.nextLine();

        System.out.println("enter user name: ");
        String name =sc.nextLine();



        users.add(new User(id,name));
        System.out.println("user added successfully");



    }

    static void viewUsers(){
        System.out.println("----Users----");

        for(User u : users){
            System.out.println(u.userId + "-" + u.name);

        }
    }

    static User getUser(int id ){
        for(User u:  users){
            if(u.userId == id)
                return u;
        }
        return null;
    }

    static void deleteUser(){
        System.out.println("enter user ID to delete: ");

        int id = sc.nextInt();


        users.removeIf(u -> u.userId == id);
        System.out.println("user deleted ");
    }



        // driver crud operation




    static void addDriver() {
        System.out.print("enter driver ID: ");
        int id = sc.nextInt();
        sc.nextLine();



        System.out.print("enter driver name : ");
        String name = sc.nextLine();



        drivers.add(new Driver(id, name));
        System.out.println("driver added ");
    }



    static void viewDrivers() {
        System.out.println("---Drivers---");


        for (Driver d : drivers) {
            System.out.println(d.driverId + " - " + d.name + "  | Available:  " + d.available );
        }
    }




    static Driver assignDriver() throws NoDriverAvailableException{

        for(Driver d : drivers){
            if(d.available){
                d.available = false;
                return d;
            }


        }
        throw new NoDriverAvailableException("no driver available");
    }

    // Ride Crud
    static void bookRide(){
        try {
            System.out.print("enter ride ID: ");
            int rideId = sc.nextInt();

            System.out.print("enter user ID: ");
            int userId = sc.nextInt();

            User user = getUser(userId);
            if (user == null) {

                System.out.println("user not found");
                return;
            }

            System.out.print("enter distance(km): ");
            double distance = sc.nextDouble();



            System.out.print("1.normal fare  2.peak fare: ");
            int choice = sc.nextInt();


            FareCalculator calculator =(choice == 1) ? new NormalFareCalculator() : new PeakFareCalculator();

            Driver driver = assignDriver();

            double fare = calculator.calculateFare(distance);

            rides.add(new Ride(rideId, user, driver, fare));

            System.out.println("ride booked | fare: " + fare);

        } catch (NoDriverAvailableException e) {


            System.out.println(e.getMessage());
        }
    }

        
    static void rideHistory(){
        System.out.println("----Ride History ----");


        for(Ride r : rides){

            System.out.println("rideID : " + r.rideId +" | user: " + r.user.name +" | driver: " + r.driver.name + " | fare: " + r.fare);
        }
    }

    public static void main(String[] args) {


        int choice; 
        do { 
            System.out.print("\nCab Booking System");
            System.out.print("1. ddd user");
            System.out.print("2. view users");
            System.out.print("3. delete Users");
            System.out.print("4. add Driver");
            System.out.print("5. view Drivers");
            System.out.print("6. book ride");
            System.out.print("7. ride History");
            System.out.print("0. exit ");
            System.out.print("enter choice : ");

            choice = sc.nextInt();



            switch(choice){
                case 1 -> addUser();
                case 2 -> viewUsers();
                case 3 -> deleteUser();
                case 4 -> addDriver();
                case 5 -> viewDrivers();
                case 6 -> bookRide();
                case 7 -> rideHistory();
                case 0 -> System.out.println("thank you");
                default -> System.out.println("invalid choice");

            }

            
        } while (choice != 0);
        
    }
    

}