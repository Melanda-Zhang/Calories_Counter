public class FoodItem implements FoodInfo{


    private String name;
    private int calories;

    public FoodItem(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    @Override
    public String getFoodName() {
        return name;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
