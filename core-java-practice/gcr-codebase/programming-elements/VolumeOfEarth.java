import java.util.*;
public class VolumeOfEarth{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        double radiusKm =6837;
        double volumeKm=(4.0/3.0)*pi*radiusKm*radiusKm*radiusKm;
        double radiusMiles=radiusKm*0.621371;
        double volumeMiles=(4.0/3.0)*pi*radiusMiles*radiusMiles*radiusMiles;
        
        
        System.out.println("The voulme of Earh in cubic kilometers is "+volumeKm+"\n"+
              "The volume of earth in cubic miles is "+volumeMiles);


    }
}
