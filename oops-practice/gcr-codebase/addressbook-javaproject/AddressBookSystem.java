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

    public Map<String, AddressBook> getAllAddressBooks(){
        return books;
    }
}

    
    
