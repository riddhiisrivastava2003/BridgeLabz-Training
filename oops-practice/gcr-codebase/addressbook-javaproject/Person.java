import java.util.*;
import java.util.Objects;

public class Person{

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    public Person(String firstName, String lastName, String address, String city, String state, String zip, String phone, String email) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phone=phone;
        this.email=email;
    }


    //getters
    public String getFirstName(){
        return firstName;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getZip(){
        return zip;
    }


    //setters
    public void setAddress(String address){
        this.address=address;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setCity(String city){   
        this.city=city;
    }

    //uc7 

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Person)) return false;
        Person person=(Person) o;
        return  firstName.equalsIgnoreCase(person.firstName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName.toLowerCase());
    
    }

    //uc10


    @Override 
    public String toString(){
        return firstName+" "+lastName+" | "+city+" | "+state+" | "+zip+" | "+phone+" | "+email;

    }

    
}