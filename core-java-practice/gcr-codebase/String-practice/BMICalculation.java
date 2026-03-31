import java.util.*;
public class BMICalculation{

    static String[][] calculateBMI(double[][] a){
        String[][] result=new String[10][4];
        
        for(int i=0;i<10;i++){
            double height=a[i][1]/100.0;
            double bmi=a[i][0]/(height*height);

            String status;
            if(bmi>=30) status="Obese";
            else if(bmi>=25) status="Overweight";
            else if(bmi>=18.5) status="Normal";
            else status ="Underweight";

            result[i][0]=String.valueOf(a[i][1]);
            result[i][1]=String.valueOf(a[i][0]);
            result[i][2]=String.format("%.2f",bmi);
            result[i][3]=status;
        }
        return result;
    }

    static void display(String[][] s){
        System.out.println("person height(cm)  weight(kg) BMI status");
        for(int i=0;i<10;i++){
            System.out.println((i+1)+"  "+s[i][0]+"  "+s[i][1]+"  "+s[i][2]+"  "+s[i][3]);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double[][] a=new  double[10][2];
        for(int i=0;i<10;i++){
            System.out.println("enter the weight and height");
            a[i][0]=sc.nextDouble();
            a[i][1]=sc.nextDouble();        
        }

            String[][] result=calculateBMI(a);
            display(result);

    }
    
}