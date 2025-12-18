import java.util.*;
class DistanceConvert{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double distanceFeet=sc.nextDouble();
        double yards=distanceFeet/3;
        double miles=yards/1760;
        System.out.println("The distance in yards "+yards+" and miles "+miles);
    }
}