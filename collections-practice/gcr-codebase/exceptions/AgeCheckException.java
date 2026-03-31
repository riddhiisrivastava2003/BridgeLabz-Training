import java.util.*;

public class AgeCheckException{


   public static class InvalidAgeException extends Exception{

    public InvalidAgeException(String msg){
        super(msg);
    }
   }


   public static void ageCheck(int age) throws InvalidAgeException{
    if(age<18){
        throw new InvalidAgeException("age must be 18 or above");
    }
    // else{
    //     System.out.println("age is valid");
    // }

   }

   public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.print("enter the age: ");
    int age=sc.nextInt();

    try{
        ageCheck(age);
        System.out.println("access granted!");
    }
    catch(InvalidAgeException e){
        System.out.println(e.getMessage());
    
    }

   }
}