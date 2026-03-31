import java.util.*;
public class TallestAndYoungest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ages");
        int ageOfAmar=sc.nextInt(), ageOfAkbar=sc.nextInt(),ageOfAnthony=sc.nextInt();
        System.out.println("Enter Heights");
        int heightOfAmar=sc.nextInt(),heightOfAkbar=sc.nextInt(),heightOfAnthony=sc.nextInt();

        int minAge=Math.min(ageOfAmar,Math.min(ageOfAkbar,ageOfAnthony));
        int maxHeight=Math.max(heightOfAmar,Math.max(heightOfAkbar,heightOfAnthony));

        if(minAge==ageOfAmar)System.out.println("Amar is Youngest");
         else if(minAge==ageOfAkbar)System.out.println("Akbar is Youngest");
          else System.out.println("Anthony is Youngest");

           if(maxHeight==heightOfAmar)System.out.println("Amar is Tallest");
             else if(maxHeight==heightOfAkbar)System.out.println("Akbar is Tallest");
               else System.out.println("Anthony is Tallest");





    }
}