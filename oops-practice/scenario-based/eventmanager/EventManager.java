import java.util.*;

public class EventManager{
    private ArrayList<Ticket> tickets=new ArrayList<>();

    public void addTicket(double price){
        tickets.add(new Ticket(price));


    }


    public void showTicket(){
        for(Ticket t:tickets){
            System.out.println(t.getPrice());
        
        }

        System.out.println();
    }



    public void sortTickets(){
        quicksort(0,tickets.size()-1);
    }



    private void quicksort(int low, int high){
        if(low<high){
            int p=part(low,high);
            quicksort(low,p-1);
            quicksort(p+1,high);
        }
    }


    private int part(int low,int high){
        double pivot=tickets.get(high).getPrice();
        int i=low-1;


        for(int j=low; j<high;j++){
            if(tickets.get(j).getPrice()<pivot){
                i++;
                swap(i,j);
        }
    }
    swap(i+1,high);

return i+1;

    
}

private void swap(int i,int j){
    Ticket temp=tickets.get(i);

    tickets.set(i,tickets.get(j));


    tickets.set(j,temp);
}

public void showTopCheapest(int a){
    for(int i=0;i<Math.min(a,tickets.size());i++){
        System.out.println(tickets.get(i).getPrice());
    }
   
    }

    public void showTopExpensive(int a){
        for(int i=tickets.size()-1;i>=tickets.size()-a;i--){
            System.out.println(tickets.get(i).getPrice());
        }
    }

}


