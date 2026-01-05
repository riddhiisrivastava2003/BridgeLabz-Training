import java.util.*;

interface Reservable{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem implements Reservable{

    private int itemId;
    private String title;
    private String author;

    private boolean isReserved=false;

    private String borrowerName;


    public LibraryItem(int itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;

    }


    public abstract int getLoanDuration();

    public void getItemDetails(){
        System.out.println("item id: "+itemId);
        System.out.println("title: "+title);
        System.out.println("author: "+author);
        System.out.println("is available: "+(isReserved ? "no":"yes"));
    }


    @Override
    public void reserveItem(String borrowerName){
        if(!isReserved){
            isReserved=true;
            this.borrowerName=borrowerName;
            System.out.println("item reserved by "+borrowerName);
        }
        else{
            System.out.println("item already reserved");
        }
    }

    @Override
    public boolean checkAvailability(){
        return !isReserved;
    }
}

    class Book extends LibraryItem{
        public Book(int itemId, String title, String author) {
            super(itemId, title, author);
           
        }

        @Override
        public int getLoanDuration() {
            return 10;
        }
    }



    class Magazine extends LibraryItem{
        public Magazine(int itemId,String title,String author){
            super(itemId,title,author);
        }

        @Override
        public int getLoanDuration() {
            return 10;
        }
    }


    class DVD extends LibraryItem{
        public DVD(int itemId,String title,String author){
            super(itemId,title,author);
        }

        @Override
        public int getLoanDuration() {
            return 5;
        }
    }



    public class LibraryManagementSystem {




        public static void processItem(LibraryItem item){

            item.getItemDetails();
            System.out.println("loan duration: "+item.getLoanDuration());
            System.out.println();

        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

            List<LibraryItem> items=new ArrayList<>();
            System.out.println("enter number of items");
            int n=sc.nextInt();
            sc.nextLine();

            for(int i=0;i<n;i++){
                System.out.println("enter details for the item: "+(i+1));
                System.out.println("item id: ");
                int itemId=sc.nextInt();
                sc.nextLine();

                System.out.println("title: ");
                String title=sc.nextLine();

                System.out.println("author: ");
                String author=sc.nextLine();

                System.out.println("enter type(1-book, 2-magazine,3-dvd)");
                int type=sc.nextInt();
                sc.nextLine();

                LibraryItem lib;

                if(type==1){
                    lib=new Book(itemId,title,author);
            }

            else if(type==2){
                lib=new Magazine(itemId,title,author);
            }

            else if(type==3){
               lib=new DVD(itemId,title,author);
            }
            else{
                System.out.println("invalid type");
                continue;
            }


            System.out.println("do you want to reserve this item?(yes/no)");
            String choice=sc.nextLine();

            if(choice.equalsIgnoreCase("yes")){
                System.out.println("enter borrower name: ");
                String borrowerName=sc.nextLine();
                lib.reserveItem(borrowerName);
            }
             
            
            items.add(lib);

        }
            System.out.println("----library items summary----");
            for(LibraryItem item: items){
                processItem(item);
                System.out.println();
            
            }

        
            }

        }

    






