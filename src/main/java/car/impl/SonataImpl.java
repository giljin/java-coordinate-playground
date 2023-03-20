package car.impl;

import car.ICar;

public class SonataImpl implements ICar {
    private final int distance;

    public SonataImpl(int distance) {
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

    @Override
    public double calculateLiter() {
        return getDistance() / getDistancePerLiter();
    }
}
