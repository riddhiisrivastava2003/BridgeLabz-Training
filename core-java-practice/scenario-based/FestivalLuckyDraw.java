import java.util.*;
public class FestivalLuckyDraw{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of visitors");
        int visitors=sc.nextInt();

        for(int i=1;i<=visitors;i++){

            System.out.println("visitor "+i+"enter your number");
            if(!sc.hasNextInt()){
                System.out.println("invalid input...enter valid number");
                sc.next();
                continue;
            }

            int number=sc.nextInt();
            if(number<=0){
                System.out.println("the number must be positive");


            }

            if(number %3==0 && number %5==0){
                System.out.println("Congratulations!!!...you won a gift..");
            }
            else{
                System.out.println("better luck next time!");
            }

        }
    }

}