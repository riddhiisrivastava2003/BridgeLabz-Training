import java.util.*;
public class VoulmeOfEarth{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        double radiuskm =6837;
        double volumekm=(4.0/3.0)*pi*radiuskm*radiuskm*radiuskm;
        double radiusMiles=radiuskm*0.621371;
        double volumeMiles=(4.0/3.0)*pi*radiusMiles*radiusMiles*radiusMiles;
        
        
        System.out.println("The voulme of Earh in cubic kilometers is "+volumekm+"\n"+
              "The volume of earth in cubic miles is "+volumeMiles);


    }
}
