import java.util.*;
public class OddOrEvenArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();

        if(num<=0) {System.out.println("Invalid input");
            return;
        }

        int size=num/2+1;
        int[] odd=new int[size];
        int[] even=new int[size];

        int oddIndex=0;
        int evenIndex=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                even[evenIndex]=i;
                evenIndex++;
            }
            else{
                odd[oddIndex]=i;
                oddIndex++;
            }

        }

        System.out.println("The odd numbers are ");
        for(int i=0;i<oddIndex;i++){
            System.out.println(odd[i]+ " ");

        }
        System.out.println("The even numbers are ");
        for(int i=0;i<evenIndex;i++ ){
            System.out.println(even[i]+" ");
        }
    }
}