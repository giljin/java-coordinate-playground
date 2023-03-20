package car;

public class Avante extends Car {

    private final int distance;
    public Avante(int distance) {
        this.distance = distance;
    }

    @Override
    public int calculate() {
        return distance / 15;
    }
}
