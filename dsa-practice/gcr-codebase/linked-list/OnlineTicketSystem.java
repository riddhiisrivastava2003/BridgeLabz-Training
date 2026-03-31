import java.util.Scanner;

class TicketNode{
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;




    TicketNode(int ticketID,String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
public class OnlineTicketSystem{
    private TicketNode head = null;
    private TicketNode tail = null;;


    //Add a new ticket
    public void addTicket(int id , String name , String movie , String seat , String time){
        TicketNode newNode = new TicketNode(id,name,movie,seat,time);
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;

        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        System.out.println("\nsuccess :ticket booked for: " + name);
    }
    //Remove ticket by id 
    public void removeTicket(int id){
        if(head == null){
            System.out.println("error :list is empty");
            return;
        }
        TicketNode curr = head, prev = null;
        boolean found = false;




        

        do{
            if(curr.ticketID == id){
                if(curr == head && curr == tail){
                    head = null;
                    tail = null;


                }else if(curr == head){
                    head = head.next;
                    tail.next = head;

                }else if(curr == tail){
                    tail = prev;
                    tail.next = head;
                }else{
                    prev.next = curr.next;
                }
                found = true;
                break;
            }
            prev = curr;
            curr = curr.next;

        }while(curr != head);
        if(found)System.out.println("ticked id: " + id + " has been cancelled");
        else System.out.println("error ticket not found");

    }



    
    public void displayTickets(){
        if(head == null){
            System.out.println("\n----No Active Bookings ----");
            return;
        }
        TicketNode temp = head;
        System.out.println("\ncurrent bookings");
        do { 
            System.out.println("[ " + temp.ticketID + " ] name: " + temp.customerName + 
                               " | movie: " +temp.movieName + " | seat: " + temp.seatNumber) ;
            temp = temp.next;
            
        } while (temp != head);

    }

    //Search by name or movie 
    public void searchTicket(String query){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)){
                System.out.println(" result: ID " + temp.ticketID + " | name: " + temp.customerName + " | seat: " + temp.seatNumber ) ;
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("no matching records found");
    }

        //Count tickets 
        public int countTickets(){
            if(head == null)
                return 0;
            int count = 0 ;
            TicketNode temp = head;
            do { 
                count++;
                temp = temp.next;
                
            } while(temp != head);
            return count;
        }

        public static void main(String[] args) {
            OnlineTicketSystem system = new OnlineTicketSystem();
            Scanner sc =new Scanner(System.in);
            int choice;
            System.out.println(" Welcome to Online Ticket Reservation System ");
            do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket (Remove by ID)");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search Ticket (by Name/Movie)");
            System.out.println("5. Show Total Count");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("enter ticket ID : ");
                    int id = sc.nextInt(); sc.nextLine();


                    System.out.print("enter customer name : ");
                    String name = sc.nextLine();


                    System.out.print("enter movie name : ");
                    String movie = sc.nextLine();


                    System.out.print("enter seat number : ");
                    String seat = sc.nextLine();



                    System.out.print("enter booking time : ");
                    String time = sc.nextLine();


                    system.addTicket(id, name, movie, seat, time);
                    break;
                case 2:
                    System.out.print("enter ticket ID to cancel : ");
                    int delId = sc.nextInt();
                    system.removeTicket(delId) ;
                    break;

                case 3:
                    system.displayTickets();
                    break;

                case 4:
                    System.out.print("search keyword (name/movie) : ");
                    String query = sc.nextLine();



                    system.searchTicket(query);
                    break;

                case 5:
                    System.out.println(" total booked tickets : " + system.countTickets());
                    break;
                case 6:
                    System.out.println(" exiting system goodbye");
                    break;


                default:
                    System.out.println(" invalid choice try again");
            }


        } while (choice != 6);
            
        
    }

}