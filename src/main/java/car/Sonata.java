package car;

public class Sonata extends Car {
    private final int distance;

    public Sonata(int distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 10;
    }

    @Override
    public double getDistance() {
        return distance;
    }
}
