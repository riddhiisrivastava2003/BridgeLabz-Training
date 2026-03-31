import java.util.*;
public class VotingEligibilityArray{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int[] age=new int[10];
    System.out.println("Enter Ages Of Students");
    for(int i=0;i<age.length;i++){
        age[i]=sc.nextInt();
    }

    System.out.println("Voting Eligibility Of Students");
    for(int i=0;i<age.length;i++){
        if(age[i]<0) System.out.println("Invalid Age");
        else if (age[i]>=18) System.out.println("The stundent with the age "+age[i]+" is eligible to vote.");
        else System.out.println("The student with the age "+age[i]+ " is not eligible to vote.");
    }
    }
}
