import java.util.*;
public class SmallestNumber{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("Fisrt is smallest");
        }
        else if(num2<num1 && num2<num3){
            System.out.println("Second is smallest");
        }
        else{
            System.out.println("Third is smallest");
        }
    }
}