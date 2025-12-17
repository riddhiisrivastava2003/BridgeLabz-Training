import java.util.Scanner;
class temperature{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double temp=sc.nextDouble();
        double farh=(temp*9/5)+32;
        System.out.println("temperature"+temp);
    }
}