public class Running extends exercise{
    private float averageSpeed;

    public Running(String name, float duration, float averageSpeed){
        super(name, duration);
        this.averageSpeed = averageSpeed;
        setCalories(averageSpeed * duration);
    }




}
