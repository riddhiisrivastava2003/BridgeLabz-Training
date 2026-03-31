import java.util.*;

public class TrafficManagementSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CircularRoundAbout roundabout = new CircularRoundAbout();
        VehicleQueue queue = new VehicleQueue(5);

        while(true){
            System.out.println("1.add vehicle to roundabout");
            System.out.println("2.move vehicle from queue to roundabout");
            System.out.println("3.remove vehicle from roundabout");
            System.out.println("4.display roundabout");
            System.out.println("5.display queue");
            System.out.println("6.exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("enter vehicle number");
                    String number = sc.next();
                    queue.enqueue(number);
                    break;

                    case 2:
                        String vehicle = queue.dequeue();
                        if(vehicle!=null){
                            roundabout.addVehicle(vehicle);
                        }
                        break;

                        case 3:
                            roundabout.removeVehicle();
                            break;

                            case 4:
                                roundabout.display();
                                break;

                                case 5:
                                    queue.display();
                                    break;

                                    case 6:
                                        System.exit(0);
                                        break;

                                        default:
                                            System.out.println("invalid choice");
                                            break;
                        
            }

            


        }

        




    }
}

 