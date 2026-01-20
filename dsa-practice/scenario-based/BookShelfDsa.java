import java.util.*;

public class BookShelfDsa {
    static class Book {
        private String title;
        private String author;
        private String genre;
        private String isbn;

        public Book(String title, String author, String genre, String isbn) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.isbn = isbn;
        }

        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getGenre() { return genre; }

      
        @Override
        public boolean equals(Object obj){
            if (this == obj) return true ;
            if (!(obj instanceof Book)) return false;
            Book b = (Book) obj;
            return isbn.equalsIgnoreCase(b.isbn);
        }

        @Override
        public int hashCode(){
            return isbn.toLowerCase().hashCode();
        }

        @Override
        public String toString(){
            return String.format("title: %s | author: %s | isbn: %s",
                    title, author, isbn);
        }
    }

  
    static class BookShelf{

        private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

        private HashSet<Book> uniqueBooks = new HashSet<>();


        public void addBook (String title, String author, String genre, String isbn) {
            Book book = new Book(title, author, genre, isbn);

            if (!uniqueBooks.add( book )) {
                System.out.println("book already exists!");
                return;
            }

            catalog.putIfAbsent(genre, new LinkedList<>());
            catalog.get(genre).add(book);

            System.out.println("book added successfully ");
        }


        public void borrowBook(String isbn) {

            for (String genre : catalog.keySet()) {
                LinkedList<Book> list = catalog.get(genre);

                Iterator<Book> it = list.iterator();
                while (it.hasNext()) {
                    Book b = it.next();
                    if (b.isbn.equalsIgnoreCase( isbn )) {
                        it.remove();            
                        uniqueBooks.remove(b);
                        System.out.println("book borrowed successfully ");
                        return;
                    }
                }
            }

            System.out.println("book not found. ");
        }

     
        public void displayCatalog() {

            if (catalog.isEmpty()) {
                System.out.println("library is empty ");
                return;
            }

            for (String genre : catalog.keySet()){
                System.out.println("\ngenre: " + genre);
                for (Book b : catalog.get(genre)) {
                    System.out.println(b);
                }
            }
        }
    }

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