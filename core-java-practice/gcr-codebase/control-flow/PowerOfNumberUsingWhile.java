import java.util.*;

 class PowerOfNumberUsingWhile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();
        int power =sc.nextInt();

        int result=1;
        int counter=0;
        if(number <=0 || power <0){
            System.out.println("Invalid Input");
        }


        else{
           
            while(counter<power){
                result=result*number;
                counter++;
                

            }

            System.out.println("result " +result);
        }
    }
}