import java.util.*;
class SimpleInterst{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double principal=sc.nextDouble, rate=sc.nextDouble(), time=sc.nextDouble();
        double Interest=(principal*rate*time)/100;
        System.out.println("Interest"+Interest);
    }
}