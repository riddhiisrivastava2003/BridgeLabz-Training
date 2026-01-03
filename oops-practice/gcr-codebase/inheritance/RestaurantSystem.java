import java.util.*;

class Person{
    String name;
    int id;
 
    Person(String name,int id){
        this.name = name;
        this.id = id;

    }

    void displayDetails(){
        System.out.println("name: " + name);
        System.out.println("id: " + id);

    }


}


interface Worker{

    void performDuties();
    
}

class Chef extends Person implements  Worker{
    String speciality;

    public Chef(String name, int id, String speciality) {
        super(name, id);

        this.speciality = speciality;

    }

    //implementing performduties 
    public void performDuties(){
        System.out.println("role : chef");
        System.out.println("speciality: " + speciality);
        System.out.println("duties: preparing and cooking meals.");

    }

    
}

class Waiter extends Person implements  Worker{

    int countTable;
    Waiter (String name, int id, int countTable){
    super(name,id);
    this.countTable = countTable;
    }


    public void performDuties(){
        System.out.println("role : waiter");
        System.out.println("table assigned: " + countTable);
        System.out.println("duties : serving food and assisting customers");

    }

}
public class RestaurantSystem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter chef details ");
        System.out.println("name : ");
        String chefName = sc.nextLine();

        System.out.println("id : ");
        int chefId = sc.nextInt();

        System.out.println("specialilty : ");
        String speciality = sc.nextLine();

        Chef chef = new Chef(chefName , chefId , speciality);

        System.out.println("\nenter waiter details");
        System.out.println("name : ");
        String waiterName = sc.nextLine();

        System.out.println("id : ");
        int waiterId = sc.nextInt();

        System.out.println("number of tables assigned : ");
        int countTable = sc.nextInt();

        Waiter waiter = new Waiter(waiterName, waiterId, countTable);

        System.out.println("\n chef information ");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\n waiter information ");
        waiter.displayDetails();
        waiter.performDuties();




    }
    
}