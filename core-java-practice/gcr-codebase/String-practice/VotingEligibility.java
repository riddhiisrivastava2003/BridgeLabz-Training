import java.util.*;
public class VotingEligibility{

    static int[] ageGeneration(int n){
        Scanner sc=new Scanner(System.in);

        int[] ages=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the age "+(i+1)+" ");
            ages[i]=sc.nextInt();
        }
        return ages;
    }
    static String[][] votingCheck(int[] ages){
        String[][] result=new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            result[i][0]=String.valueOf(ages[i]);
            if(ages[i]<0){
                result[i][1]="false";
            }
            else if(ages[i]>=18){
                result[i][1]="true";
            }
            else{
                result[i][1]="false";
            }
        }
        return result;
    } 

    static void display(String[][] data ){

        for(String[] row:data){
        System.out.println(row[0]+"\t\t"+row[1]);
    }

    
}
    public static void main(String[] args){
        int[] ages=ageGeneration(10);
        String[][] result=votingCheck(ages);
        display(result);

}
}

