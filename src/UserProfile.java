import java.util.ArrayList;
import java.util.HashMap;

public class UserProfile {
    private String name;
    private int caloriesIntake = 0;
    private int age;
    private double weight;
    private double height;
    private char gender;
    private boolean isKg;
    private boolean isCM;
    private int totalCalories;
    private HashMap<String,Integer> foodDiary = new HashMap<>();
    private HashMap<String,Integer> ExerciseDiary = new HashMap<>();



    public UserProfile(String name, int age, boolean isKg,boolean isCM,  double weight, double height, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;

        if(!isKg){
            this.weight = weight * 0.45359237;
        }

        if(!isCM){
            this.height = height * 30.48;
        }

        if(gender == 'F'){
            totalCalories = (int) (447.593 + (9.247 * weight ) + (3.098 * height) - (4.330 * age));
        }
        else{
            totalCalories = (int)(88.362 + (13.397 * weight )+ (4.799 * height) - (5.677 * age));
        }
    }

   private int getTotalCalories(){
       return totalCalories;
   }
   public void myCaloriesTotal(){
        System.out.println("Your recommended calorie intake is " + getTotalCalories());
    }

   private int getCaloriesTake(){
       return caloriesIntake;
   }

   public void myCalorieTotalToday(){
       System.out.println("Your total calorie for today is " + getCaloriesTake());
   }

   private int getRemainingcalories(){
       return totalCalories - caloriesIntake;
   }

   public void myCalorieremainingToday(){
       if (getRemainingcalories() <= 0) {
           System.out.println("You have reached your calorie intake for today");
       }
       else{
           System.out.println("Your remaining calorie for today is " + getRemainingcalories());
       }
   }
   public void userSummary() {
       myCaloriesTotal();
       myCalorieTotalToday();
       myCalorieremainingToday();
   }

   public void ConsumeFood(FoodItem food){
        caloriesIntake += food.getCalories();
        foodDiary.put(food.getFoodName(), food.getCalories());
   }

   public void addExercise(exercise e){
        caloriesIntake -= e.getCalories();
        ExerciseDiary.put(e.getName(), (int) e.getCalories());
   }
   public void TodaysFood(){
        for (var entry : foodDiary.entrySet()){
            String foodName = entry.getKey();
            Integer calories = entry.getValue();
            System.out.println("Food " + foodName + ", Calories: " + calories);
        }
   }

    public void TodaysExercise(){
        for (var entry : ExerciseDiary.entrySet()){
            String ExerciseName = entry.getKey();
            Integer calories = entry.getValue();
            System.out.println("Food " + ExerciseName + ", Calories: " + calories);
        }
    }

}




