
import java.util.*;
public class HotelService  {


private ArrayList<Room> rooms=new ArrayList<>();
private ArrayList<Reservation> reservations=new ArrayList<>();


private PricingStrategy pricing =new NormalPricing(); 

public HotelService(){
    rooms.add(new StandardRoom(101));
    rooms.add(new StandardRoom(102));
    rooms.add(new DeluxRoom(201));
    rooms.add(new DeluxRoom(202));  




}

public void addRoom(Room room){
    rooms.add(room);
    System.out.println("room added");
}


public void viewRooms(){
    for(Room r:rooms){
        System.out.println(r.getRoomNumber()+"  "+r.getType()+" available "+r.isAvailable());
    }
}

public void bookRoom(int roomNumber,String guestName) throws RoomNotAvailableException{
    for(Room r:rooms){
        if(r.getRoomNumber()==roomNumber){
            if(!r.isAvailable()){
                throw new RoomNotAvailableException("room not available");
            }
            
                r.checkIn();
                reservations.add(new Reservation(r, new Guest(guestName)));
                System.out.println("room booked");
                return;
        }

        }
        throw new RoomNotAvailableException("room not found");

    }

 
    public void checkOut(int roomNo){
        Iterator<Reservation> it=reservations.iterator();
        while(it.hasNext()){
            Reservation r=it.next();
            if(r.getRoom().getRoomNumber()==roomNo){
                r.getRoom().checkOut();
                it.remove();
                System.out.println("room checked out");
                return;
            }

        }
        System.out.println("reservation not found");

    }



    public void generateInvoice(int roomNumber){
        for(Reservation r:reservations){
            if (r.getRoom().getRoomNumber()==roomNumber) {
                double price=pricing.calculatePrice(r.getRoom().basePrice);
                System.out.println("guest "+r.getGuest().getName());
                System.out.println("room number "+r.getRoom().getRoomNumber());
                System.out.println("total price "+price);
                return;

                
            }
            }
            System.out.println("reservation not found");



}


public void setSeasonalPricing(boolean seasonal){
    pricing=seasonal?new SeasonalPricing():new NormalPricing();

}

}

  

