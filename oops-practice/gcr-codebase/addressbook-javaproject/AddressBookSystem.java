import java.util.*;

public class AddressBookSystem{

    //uc5

    private Map<String, AddressBook> books=new HashMap<>();

    public void addAddressBook(String name){
        books.put(name,new AddressBook());
        System.out.println("address book added" +name);
    }

    public AddressBook getAddressBook(String name){
        return books.get(name);
    }

    // public Map<String, AddressBook> getAllAddressBooks(){
    //     return books;
    // }

    public void  searchByCity(String city){
        for(String book : books.keySet() ){
            for(Person p:books.get(book).searchByCity(city)){
            System.out.println(book+" -> "+p);
        }
    }
}


public void searchByState(String state){
     for(String book : books.keySet() ){
            for(Person p:books.get(book).searchByState(state)){
            System.out.println(book+" -> "+p);
        }
    }

}


public void countByCity(String city){
   int total=0;
   for(AddressBook book:books.values()){
    total+=book.countByCity(city);

   }
   System.out.println("total person in city "+city+" : "+total);


}


public void countByState(String state){
   int total=0;
   for(AddressBook book:books.values()){
    total+=book.countByState(state);

   }
   System.out.println("total person in city "+state+" : "+total);


}
}
    
    
