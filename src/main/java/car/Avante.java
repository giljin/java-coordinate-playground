package car;

public class Avante extends Car {

    private final int distance;
    public Avante(int distance) {
        this.distance = distance;
    }
    @Override
    public double getDistancePerLiter() {
        return 15;
    }

    @Override
    public double getDistance() {
        return distance;
    }
}
