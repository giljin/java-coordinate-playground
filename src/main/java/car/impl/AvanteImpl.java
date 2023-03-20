package car.impl;

import car.ICar;

public class AvanteImpl implements ICar {
    private final int distance;

    public AvanteImpl(int distance) {
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

    @Override
    public double calculateLiter() {
        return getDistance() / getDistancePerLiter();
    }
}
