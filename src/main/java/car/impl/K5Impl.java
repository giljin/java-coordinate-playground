package car.impl;

import car.ICar;

public class K5Impl implements ICar {
    private final int distance;

    public K5Impl(int distance) {
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

    @Override
    public double calculateLiter() {
        return getDistance() / getDistancePerLiter();
    }
}
