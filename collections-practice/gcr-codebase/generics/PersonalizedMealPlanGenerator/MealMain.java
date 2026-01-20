import java.util.*;

public class MealMain{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        while(true){

            System.out.println("personalized meal plan generator ");
            System.out.println("----------------------------------");
            System.out.println("1.high protien meal");
            System.out.println("2.vegetarian meal");
            System.out.println("3.vegan meal");
            System.out.println("4.keto Mmeal");
            System.out.println("5.exit");


            System.out.print("choose meal type: ");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    MealGenerator.generateMeal(new HighProtienMeal());
                    break;
                case 2:
                    MealGenerator.generateMeal(new VegMeal());
                    break;
                case 3:
                    MealGenerator.generateMeal(new VeganMeal());
                    break;
                case 4:
                    MealGenerator.generateMeal(new KetoMeal());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("invalid choice");
            }

        }
    }
}