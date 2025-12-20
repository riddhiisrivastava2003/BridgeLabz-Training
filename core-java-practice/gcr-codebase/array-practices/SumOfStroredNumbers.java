import java.util.*;
public class SumOfStroredNumbers{
   public static void main(String args[]){ 
    Scanner sc=new Scanner (System.in);

    double[] num=new double[10];
    double sum=0.0;
    int i=0;
    System.out.println("Enter the numbers");
     
     while(true){
        
        double input=sc.nextDouble();

        if(input<=0) {break;}
        if (i==10) {break;}

        num[i]=input;
        i++;
     }

        System.out.println("the entered numbers are");
        for(int a=0;a<i;a++){
            System.out.println(num[a]);
            sum=sum+num[a];
        }
        System.out.println("The sum is: "+sum);
    }

     }
