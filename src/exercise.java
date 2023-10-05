public abstract class exercise {

    private String name;
    private float duration;
    private float calories;


    public exercise(String name, float duration) {
        this.name = name;
        this.duration = duration;
    }


    public String getName() {
        return name;
    }

    public float getDuration() {
        return duration;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories){
        this.calories = calories;
    }




}
