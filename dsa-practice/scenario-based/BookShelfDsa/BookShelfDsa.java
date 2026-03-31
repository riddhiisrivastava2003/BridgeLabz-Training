import java.util.*;

public class BookShelfDsa {
    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        while (true) {
            // System.out.println("\n--- Library Menu ---");
            System.out.println("1. add book");
            System.out.println("2. obrrow book");
            System.out.println("3. display catalog");
            System.out.println("4. exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("enter title : ");
                    String title = sc.nextLine();

                    System.out.print("enter author : ");
                    String author = sc.nextLine();

                    System.out.print("enter genre : ");
                    String genre = sc.nextLine();

                    System.out.print("enter ISBN : ");
                    String isbn = sc.nextLine();

                    shelf.addBook(title, author, genre, isbn);
                    break;

                case 2:
                    System.out.print("enter ISBN to borrow: ") ;
                    String borrowIsbn = sc.nextLine();
                    shelf.borrowBook(borrowIsbn);
                    break;

                case 3:
                    shelf.displayCatalog() ;
                    break;

                case 4:
                    System.out.println("exiting...");
                    System.exit(0);

                default:
                    System.out.println("invalid choice! ");
            }
        }
    }
}