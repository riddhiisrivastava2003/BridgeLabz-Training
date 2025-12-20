import java.util.*;

public class BMICalculation2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of people ");
        int n=sc.nextInt();
        double[][] personData=new double[n][3];
        String[] weightStatus=new String[n];
        for(int i=0;i<n;i++){
            System.out.println((i+1));
            personData[i][0]=sc.nextDouble();
            personData[i][1]=sc.nextDouble();
            if(personData[i][0]<=0 || personData[i][1]<=0){
                System.out.println("invalid input");
                i--;
            }
        }

        for(int i=0;i<n;i++){
            personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
           if(personData[i][2]<=18.4){weightStatus[i]="Underweight";}
            else if(personData[i][2]>=18.5 && personData[i][2]<=24.9){weightStatus[i]="Normal";}
            else if(personData[i][2]>=25.0 && personData[i][2]<=39.9){weightStatus[i]="Overweight";}
            else{weightStatus[i]="Obese";}
        }
        

       
        for(int i=0;i<n;i++){
            System.out.println("Person "+(i+1));
         System.out.println("Height in m"+personData[i][1]);
          System.out.println("Weight in kg "+personData[i][2]);
           System.out.println("BMI "+personData[i][2]);
            System.out.println("Status "+weightStatus[i]);
        }

    }
}