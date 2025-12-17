import java.util.*;
class Conversion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double kilometers=sc.nextdouble();
        double miles=kilometers*0.621371;
        System.out.println("Miles"+miles);
    }
}