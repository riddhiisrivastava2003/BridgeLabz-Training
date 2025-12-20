import java.util.*;
public class DigitFrequecy{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        int temp=number;
        int count=0;
        while(temp !=0){
            count++;
            temp /=10;

        }
        int[] digits=new int[count];
        int index=0;
        while(number !=0){
            digits[index]=number%10;
            index++;
            number /=10;
            

        }

        int[] frequency=new int[10];
        for(int i=0;i<count;i++){
            frequency[digits[i]]++;

        }
        System.out.println("Digit Frequency");
        for(int i=0;i<10;i++){
            if(frequency[i]>0){
                System.out.println("Digit " + i + " : " + frequency[i]);

            }
        }


    }
    
}