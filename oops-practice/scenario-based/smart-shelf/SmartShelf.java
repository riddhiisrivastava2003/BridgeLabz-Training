import java.util.*;

public class SmartShelf{
    private ArrayList<Book> books=new ArrayList<>();

    public void addBook(String title){
        Book newBook=new Book(title);
        books.add(newBook);

        int i=books.size()-1;
        while(i>0 && books.get(i-1).getTitle().compareToIgnoreCase(books.get(i).getTitle())>0){
            Book temp=books.get(i);
            books.set(i,books.get(i-1));
            books.set(i-1,temp);
            i--;

        }
        System.out.println("book aded");

    }


    public void showShelf(){
        if(books.isEmpty()){
            System.out.println("empty");
            return;

        }

        System.out.println("smartshelf sorted: ");
        for(Book b:books){
            System.out.println(b.getTitle());
        }
    }



}