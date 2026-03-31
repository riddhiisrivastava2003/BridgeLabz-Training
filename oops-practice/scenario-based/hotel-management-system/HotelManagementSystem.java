import java.util.*;
public class HotelManagementSystem{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    HotelService hotel=new HotelService();

    while(true){
        System.out.println("hotel registration system");
        System.out.println("1. view rooms");
        System.out.println("2. book room");
        System.out.println("3. check out");
        System.out.println("4. generate invoice");
        System.out.println("5. enable seasonal pricing");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        

        try{
            switch(choice){
                case 1:
                    hotel.viewRooms();
                    break;
                    case 2:
                        System.out.println("enter room no.");
                        int r=sc.nextInt();
                        System.out.println("enter guest name");
                        String name=sc.nextLine();
                        hotel.bookRoom(r,name);
                        break;
                        case 3:
                            System.out.println("enter room no.");
                            int roomNo=sc.nextInt();
                            hotel.checkOut(roomNo);
                            break;
                                case 4:
                                    System.out.println("enter room no.");
                                    int room=sc.nextInt();
                                    hotel.generateInvoice(room);
                                    break;
                                    case 5:
                                        hotel.setSeasonalPricing(true);
                                        break;
                                        case 6:
                                            hotel.setSeasonalPricing(false);
                                            break;
                                        default:
                                            System.out.println("invalid choice");
                                            break;

                                        

            }

        }

        catch(RoomNotAvailableException e){
            System.out.println(e.getMessage());
        }
        
            
    }
}

}