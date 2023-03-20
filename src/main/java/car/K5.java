package car;

public class K5 extends Car {

    private final int distance;
    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 13;
    }

    @Override
    public double getDistance() {
        return distance;
    }
}
