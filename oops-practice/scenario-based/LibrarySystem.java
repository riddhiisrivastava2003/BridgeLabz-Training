import java.util.*;
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
}

public class LibrarySystem{
    static List<Book> bookList = new ArrayList<>();

    static String[] bookTitles ={
            "Java Programming","dsa","os","cn","dbms"};

    static String[] bookAuthors ={
           "James Gosling","Mark Allen Weiss","Abraham Silberschatz","Andrew S. Tanenbaum","Raghu Ramakrishnan"};

    static boolean[] isBookAvailable ={
            true, true, true, true, true};


    static void loadBooksIntoList() {

        for (int i = 0;i<bookTitles.length;i++) {
           
            bookList.add(new Book( bookTitles[i],bookAuthors[i],isBookAvailable[i] ));
        }
    }



    static void displayBooks(){
        System.out.println();
        for (int i =0; i<bookTitles.length;i++) {
            System.out.println(
                    (i + 1) + ". " + bookTitles[i] +
                    "  | Author : " + bookAuthors[i] +
                    " |   Status : " + (isBookAvailable[i] ? "Available" : "Checked Out")
            );

        }

    }

    static void searchBook(String searchText){
        boolean found = false;
        System.out.println("\nSearch results:");
        for (int i = 0; i < bookTitles.length; i++){

            if (bookTitles[i].toLowerCase().contains(searchText.toLowerCase())) {
                System.out.println(

                        (i + 1) + ". " + bookTitles[i] +
                        "| status: " + (isBookAvailable[i] ? "available" : "checked out")
                );


                found = true;
            }
        }
        if (!found){
            System.out.println("no matching books found");
        }
    }


    static void checkoutBook(int bookNumber) throws BookNotAvailableException{
        if (bookNumber < 1 || bookNumber > bookTitles.length){
            System.out.println("invalid book number");

            return;
        }
        Book book = bookList.get(bookNumber - 1);
        if (!book.isAvailable) {

            throw new BookNotAvailableException("book is already checked out");
        }

        book.isAvailable = false;

        System.out.println("book checked out successfully");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        loadBooksIntoList();
        displayBooks();

        System.out.print("enter part of book title to search: ");
        String searchText = sc.nextLine();
        searchBook(searchText);

        System.out.print("enter book number to checkout: ");
        int bookNumber = sc.nextInt();
        

        try {

            checkoutBook(bookNumber);

        } catch (BookNotAvailableException e) {

            System.out.println("error: " + e.getMessage());
        }
        
        displayBooks();

      
    }
}