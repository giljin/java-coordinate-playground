package coordinate;

public class Coordinate {
    private final Position x;
    private final Position y;
    public Coordinate(Position x, Position y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Coordinate coordinate) {
        double xPow = Math.pow(this.x.minusPostion(coordinate.x), 2);
        double yPow = Math.pow(this.y.minusPostion(coordinate.y), 2);
        return Math.sqrt(xPow + yPow);
    }
}
