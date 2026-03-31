public class HighProtienMeal implements MealPlan{

    @Override

    public String getMealType(){
        return "high protien meal";
    }

    @Override

    public void showMeal(){
        System.out.println("meal : eggs, chicken, milk,..");
    }
}