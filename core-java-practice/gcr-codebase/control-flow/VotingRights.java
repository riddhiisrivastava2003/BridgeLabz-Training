import java.util.*;
class VotingRights{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("The person is eligible to vote");
        }
        else{
            System.out.println("The person is not eligible to vote");
        }
    }
}