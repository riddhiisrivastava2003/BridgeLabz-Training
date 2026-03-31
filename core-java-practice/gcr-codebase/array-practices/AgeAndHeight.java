import java.util.*;
public class AgeAndHeight{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String[] names={"Amar","Akbar","Anthony"};

        int[] age=new int[3];
        double[] height=new double[3];

        for(int i=0;i<3;i++){
            System.out.println("enter details "+names[i]);
            System.out.print("age: ");
            age[i]=sc.nextInt();
            System.out.print("height: ");
            height[i]=sc.nextDouble();}

            int youngest=0;
            int tallest=0;

            for(int i=1;i<3;i++){
                if(age[i]<age[youngest]){
                    youngest=i;
                }
                if(height[i]>height[tallest]){
                    tallest=i;
                }
            }
            System.out.println("youngest friend "+names[youngest]);
            System.out.println("tallest friend "+names[tallest]);




        }
    }
