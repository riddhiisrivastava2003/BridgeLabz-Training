import java.util.Scanner;

class Books {
    String title;
    int year;
    Books(String title, int year){
        this.title  = title;
        this.year = year;

    }

   
    void displayInfo(){
        System.out.println("book title: " +title);
        System.out.println("publication year: " +year);

    }
    
}

class Author extends Books{
    String authorName;
    String authorBio;


    Author(String title, int year , String authorName , String authorBio){
        super(title , year);
        this.authorName = authorName ; 
        this.authorBio = authorBio;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("author Name: " + authorName);
        System.out.println("author Bio " + authorBio);
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter title: ");
        String bookTitle = sc.nextLine();
        System.out.println("enter publication year: ");
        int year = sc.nextInt(); 
        sc.nextLine();       
        System.out.println("enter author name: ");
        String authorName = sc.nextLine();
        System.out.println("enter author bio : ");
        String authorBio = sc.nextLine();
        
        Author bookDetails = new Author(bookTitle , year , authorName , authorBio);
        System.out.println("Book and Author Details ");
        bookDetails.displayInfo();
        sc.close();
    }   
}