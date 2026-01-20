import java.util.*;

public class BookShelf{

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
                    if (b.getIsbn().equalsIgnoreCase(isbn )) {
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