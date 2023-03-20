package car;

public class K5 extends Car {

    private final int distance;
    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    public int calculate() {
        return distance / 13;
    }
}
