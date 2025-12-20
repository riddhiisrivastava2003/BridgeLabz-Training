import java.util.*;

public class BMICalculation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of people ");
        int n=sc.nextInt();

        double[] weight=new double[n];
        double[] height=new double[n];
        double[] bmi=new double[n];
        String[] status=new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the details "+(i+1));
            System.out.print("Weight "); weight[i]=sc.nextDouble();
            System.out.print("Height "); height[i]=sc.nextDouble();

        }

        for(int i=0;i<n;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);

            if(bmi[i]<=18.4){status[i]="Underweight";}
            else if(bmi[i]>=18.5 && bmi[i]<=24.9){status[i]="Normal";}
            else if(bmi[i]>=25.0 && bmi[i]<=39.9){status[i]="Overweight";}
            else{status[i]="Obese";}
        }

        for(int i=0;i<n;i++){
            System.out.println("Person "+(i+1));
         System.out.println("Height in m"+height[i]);
          System.out.println("Weight in kg "+weight[i]);
           System.out.println("BMI "+bmi[i]);
            System.out.println("Status "+status[i]);
        }

    }
}