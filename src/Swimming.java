public class Swimming extends exercise{


    private int distance;
    private float averageSpeed;

    public Swimming(String name, float duration, int distance, float averageSpeed) {
        super(name, duration);
        setCalories(distance * duration * averageSpeed);
    }
}
