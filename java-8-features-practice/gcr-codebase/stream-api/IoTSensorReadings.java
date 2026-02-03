import java.util.*;
import java.util.stream.*;

public class IoTSensorReadings{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        List<Double> readings=new ArrayList<>();

        System.out.println("Enter number of sensor readings: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter sensor reading: ");
            double reading=sc.nextDouble();
            readings.add(reading);
        }

        System.out.println("Enter threshold value: ");
        double threshold=sc.nextDouble();

        System.out.println("Sensor Readings Above Threshold: ");
        readings.stream()
        .filter(r->r>threshold)
        .forEach(r->System.out.println("Sensor Reading: "+r));
    

    }
}