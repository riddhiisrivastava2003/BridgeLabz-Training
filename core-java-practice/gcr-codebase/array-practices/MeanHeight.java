import java.util.*;
public class MeanHeight{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        double[] heights=new double[11];
        double sum=0.0;

        System.out.println("Enter Heights");
        for(int i=0;i<heights.length;i++){
            heights[i]=sc.nextDouble();
            sum=sum+heights[i];

        }
        
        double meanHeight=sum/heights.length;
        System.out.println("The mean height is :"+meanHeight);
    }
}