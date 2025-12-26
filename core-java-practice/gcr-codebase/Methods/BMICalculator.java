import java.util.*;
public class BMICalculator{

    public static void bmiCalculation(double[][] data){
        for(int i=0;i<data.length;i++){
            double weight=data[i][0];
            double height=data[i][1];
            double heightInMeter=height/100;

            data[i][2]=weight/(heightInMeter*heightInMeter);
        }
    }


    public static String getStatus(double bmi){
        if(bmi<=18.4){
            return "UnderWeight";
        }
        else if(bmi>=18.5 && bmi<=24.9){
            return "Normal";
        }
        else if(bmi>=25 && bmi<=39.9){
            return "OverWeight";
        }
        else{
            return "Obese";
        }
    
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        double[][] data=new double[3][3];

        for(int i=0;i<data.length;i++){
            System.out.println("\nenter details for person "+(i+1));
            System.out.println("weight ");
            data[i][0]=sc.nextDouble();

            System.out.println("height ");
            data[i][1]=sc.nextDouble();

        }

        bmiCalculation(data);


        System.out.printf("%-10s %-10s %-15s%n", "weight", "height", "BMI","Status");
        for(int i=0;i<10;i++){
            double bmi=data[i][2];
            System.out.printf("%-10.2f %-10.2f %-15s%n",data[i][0],data[i][1],bmi,getStatus(bmi));

            
        }

    }
}