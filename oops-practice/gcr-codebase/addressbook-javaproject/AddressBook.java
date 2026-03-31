import java.util.*;
//import java.util.stream.Collectors;

public class AddressBook{

    //uc4

    private List<Person> persons=new ArrayList<>();

    //uc1
    //uc6+uc7

    public void addPerson(Person person){
        if(persons.contains(person)){
            System.out.println("duplicate entry not allowed");
            return;
        
        }


        persons.add(person);
        System.out.println("person added successfully");

        System.out.println("person added: "+persons);
    }

    public void displayAll(){
        if(persons.isEmpty()){
            System.out.println("no contacts");
            return;
        }

        System.out.println("all contacts: ");
        for(Person p: persons){
            System.out.println(p);
        }
    }


    //uc2

    public void editPerson(String name, Scanner sc){
        for(Person p: persons){
            if(p.getFirstName().equalsIgnoreCase(name)){
                System.out.print("new address:");
                String address=sc.nextLine();
                p.setAddress(address);

                System.out.print("new phone:");
                String phone=sc.nextLine();
                p.setPhone(phone);

                System.out.print("new email:");
                String email=sc.nextLine();
                p.setEmail(email);

                System.out.print("new city:");
                String city=sc.nextLine();
                p.setCity(city);

                System.out.println("contact updated");
                System.out.println(p);
                return;
            }
        
        }

        System.out.println("person not found");
    
    }



    //uc3

    public void deletePerson(String name){
        //persons.removeIf(p->p.getFirstName().equalsIgnoreCase(name));
        boolean removed=persons.removeIf(p->p.getFirstName().equalsIgnoreCase((name)));
       // System.out.println("person deleted");

       System.out.println(removed ? "Person deleted ":"person not found");

    }


    //uc8

    public List<Person> searchByCity(String city){
       // return persons.stream().filter(p->p.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
       List<Person> result=new ArrayList<>();
       for(Person p:persons){
        if(p.getCity().equalsIgnoreCase(city)){
            result.add(p);
        }

       }
       return result;

    }

    public List<Person> searchByState(String state){
       // return persons.stream().filter(p->p.getState().equalsIgnoreCase(state)).collect(Collectors.toList());
        List<Person> result=new ArrayList<>();
       for(Person p:persons){
        if(p.getState().equalsIgnoreCase(state)){
            result.add(p);
        }

       }
       return result;
    }

    //uc9


    public long countByCity(String city){
        return searchByCity(city).size();
    }

    public int countByState(String state){
        return searchByState(state).size();
    }


    //uc10

    public void sortByName(){
        persons.sort(Comparator.comparing(Person::getFirstName));
       // persons.forEach(System.out::println);
       displayAll();

    }

    //uc11

    public void sortByCity(){
        persons.sort(Comparator.comparing(Person::getCity));
       // persons.forEach(System.out::println);
       displayAll();

    }


    public void sortByState(){
        persons.sort(Comparator.comparing(Person::getState));
       // persons.forEach(System.out::println);
       displayAll();

    }

    public void sortByZip(){
        persons.sort(Comparator.comparing(Person::getZip));
        //persons.forEach(System.out::println);
        displayAll();

    }

    public List<Person> getPersons(){
        return persons;
    }



    
    }


