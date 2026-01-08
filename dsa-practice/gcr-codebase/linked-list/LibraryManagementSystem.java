import java.util.*;
class BookNode{

    String title;
    String author;
    String genre;
    int bookId;
    boolean available;
    BookNode next,prev;



    
    BookNode(String title,String author,String genre,int bookId,boolean available){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.bookId=bookId;
        this.available=available;
       
    }



}






class LibraryDoublyLinkedList{
    private BookNode head,tail;

    void addAtBeginning(String title,String author,String genre,int bookId,boolean available){
        BookNode newNode=new BookNode(title,author,genre,bookId,available);


        if(head==null){
            head=tail=newNode;
        }

        
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }   
        System.out.println("book added at the beginning successfully");

    }






    void addAtEnd(String title,String author,String genre,int bookId,boolean available){
        BookNode newNode=new BookNode(title,author,genre,bookId,available);
        if(tail==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }


        System.out.println("book added at the end successfully");

    }





    void addAtPosition(int position, String title,String author,String genre,int bookId,boolean available){
        if(position<=1){
            addAtBeginning(title,author,genre,bookId,available);
            return;
        }



        BookNode temp=head;
        for(int i=1;i<position-1 && temp!=null;i++)
            temp=temp.next;

            if(temp==null || temp==tail){
                addAtEnd(title,author,genre,bookId,available);
                return;
            }
        



            BookNode newNode=new BookNode(title,author,genre,bookId,available);
            newNode.next=temp.next;
            temp.next.prev=newNode;
            newNode.prev=temp;
            temp.next=newNode;



            System.out.println("book added at the position successfully");





        
       
    }


    void removeByBookId(int bookId){
        BookNode temp=head;
        while(temp!=null){
            if(temp.bookId==bookId){
                if(temp==head){
                    head=head.next;
                    if(head!=null) head.prev=null;
                }
                else if(temp==tail){
                    tail=tail.prev;
                    tail.next=null;
                }
                else{
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                }
                System.out.println("book removed successfully");
                return;
            }
            temp=temp.next;
        }



        System.out.println("book not found");
    }




    void searchByTitle(String title){
        BookNode temp=head;
        boolean found=false;
        while(temp!=null){
            if(temp.title.equalsIgnoreCase(title)){
                printBook(temp);
                found=true;
            }
            temp=temp.next;
        }
        if(!found) System.out.println("book not found");
    




    }

    void searchByAuthor(String author){
        BookNode temp=head;
        boolean found=false;
        while(temp!=null){
            if(temp.author.equalsIgnoreCase(author)){
                printBook(temp);
                found=true;
            }
            temp=temp.next;
        }
        if(!found) System.out.println("book not found");

    }


    

    void updateAvailability(int bookId,boolean status){
        BookNode temp=head;
        while(temp!=null){
            if(temp.bookId==bookId){
                temp.available=status;
                System.out.println("book availability updated successfully");
                return;
            }



            temp=temp.next;
        }
        System.out.println("book not found");
    }





    void displayForward(){
        BookNode temp=head;
        if(temp==null) System.out.println("list is empty");
        
            while(temp!=null){
                printBook(temp);
                temp=temp.next;
        
    }
}

     void displayReverse(){
        BookNode temp=tail;
        if(temp==null) System.out.println("list is empty");
        while(temp!=null){
            printBook(temp);
            temp=temp.prev;
        }
        
     }

     void countBooks(){
        BookNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

}
System.out.println("total books "+count);

     }


     private void printBook(BookNode book){
        System.out.println("title: "+book.title);
        System.out.println("author: "+book.author);
        System.out.println("genre: "+book.genre);
        System.out.println("book id: "+book.bookId);    
        System.out.println("available: "+(book.available?"yes":"no"));



     }

    }

    public class LibraryManagementSystem{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            LibraryDoublyLinkedList list=new LibraryDoublyLinkedList();
            int choice;

            do{
                System.out.println("\nLibrary Management System");
                System.out.println("1. Add Book at Beginning");
                System.out.println("2. Add Book at End");
                System.out.println("3. Add Book at Specific Position");
                System.out.println("4. Remove Book by ID");
                System.out.println("5. Search Book by Title");
                System.out.println("6. Search Book by Author");
                System.out.println("7. Update Book Availability");
                System.out.println("8. Display All Books (Forward)");
                System.out.println("9. Display All Books (Reverse)");
                System.out.println("10. Count Total Books");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice=sc.nextInt();
                sc.nextLine(); 




                switch(choice){
                    case 1, 2, 3 -> {
                        System.out.print("enter title: ");
                        String title=sc.nextLine();
                        System.out.print("enter author: ");
                        String author=sc.nextLine();
                        System.out.print("enter genre: ");
                        String genre=sc.nextLine();
                        System.out.print("enter book ID: ");
                        int bookId=sc.nextInt();
                        System.out.print("is available (true/false): ");
                        boolean available=sc.nextBoolean();
                        sc.nextLine(); 




                        if(choice==1)
                            list.addAtBeginning(title,author,genre,bookId,available);
                        else if(choice==2)
                            list.addAtEnd(title,author,genre,bookId,available);
                        else {


                            System.out.print("enter position: ");
                            int position=sc.nextInt();
                            sc.nextLine(); 


                            list.addAtPosition(position,title,author,genre,bookId,available);
                        }
                    }
                    case 4 -> {
                        System.out.print("enter book ID to remove: ");
                        int bookId=sc.nextInt();
                        list.removeByBookId(bookId);
                    }
                    case 5 -> {


                        System.out.print("enter title to search: ");
                        String title=sc.nextLine();
                        list.searchByTitle(title);
                    }


                    case 6 -> {
                        System.out.print("enter author to search: ");
                        String author=sc.nextLine();
                        list.searchByAuthor(author);
                    }


                    case 7-> {
                        System.out.print("enter book ID to update: ");
                        int bookId=sc.nextInt();



                        System.out.print("enter new availability (true/false): ");
                        boolean available=sc.nextBoolean();
                        list.updateAvailability(bookId,available);
                    }
                    case 8 -> list.displayForward();
                    case 9 -> list.displayReverse();
                    case 10 -> list.countBooks();


                    
                    case 0 -> System.out.println("exiting...") ;
                    default->System.out.println("invalid choice");
                }
            }
            while(choice!=0);
        }
    }  

    







