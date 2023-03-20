package car;

public class Sonata extends Car {
    private final int distance;

    public Sonata(int distance) {
        this.distance = distance;
    }

    @Override
    public int calculate() {
        return distance / 10;
    }
}
