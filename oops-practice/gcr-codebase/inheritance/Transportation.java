import java.util.*;


class Vehicle{
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed,String model){
        this.maxSpeed=maxSpeed;


        this.model=model;
    }

void display(){
    System.out.println();

    System.out.println("max speed in kmph: "+maxSpeed);


    System.out.println("model: "+model);

}

}



interface Refuelable{
    void refuel();

}

class Electric extends Vehicle{
    Electric(int maxSpeed,String model){
        super(maxSpeed,model);


    }

    void charge(){
        System.out.println("charging the electric vehicle");
    }

    }


    class Petrol extends Vehicle implements Refuelable{
    Petrol(int maxSpeed,String model){
        super(maxSpeed,model);


    }

    public void refuel(){
        System.out.println("Refueling the petrol vehicle");
    }

    }


    


public class Transportation{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter vehicle type(electric/petrol)");
        String type=sc.nextLine().toLowerCase();

        System.out.println("enter model");
        String model=sc.nextLine();

        System.out.println("enter max speed");
        int speed=sc.nextInt();

        if(type.equals("electric")){
            Electric ev=new Electric(speed,model);
            ev.display();
            ev.charge();
        }

        else if(type.equals("petrol")){
            Petrol pv=new Petrol(speed,model);
            pv.display();
            pv.refuel();

        }

        else{
            System.out.println("invalid input");
        }


    
    }
    
}