public class Main {
    public static void main(String[] args){



        //public UserProfile(String name, int age, boolean isKg,boolean isCM,  double weight, double height, char gender) {
    UserProfile user1 = new UserProfile("Melanda", 17, true, true, 85, 167, 'F');
    UserProfile user2 = new UserProfile("Melanda", 17, false, false, 85, 167, 'F');


    user1.userSummary();

    user2.ConsumeFood(new FoodItem("Cookie", 3000));
    user2.addExercise(new Running("My first run", 10, 20));





    }
}