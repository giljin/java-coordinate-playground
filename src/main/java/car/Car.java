package car;

public abstract class Car {
    public abstract double getDistancePerLiter();

    public abstract double getDistance();

    public double calculateLiter(){
        return getDistance() / getDistancePerLiter();
    }

}
