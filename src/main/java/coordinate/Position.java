package coordinate;

public class Position {

    private final int location;

    public Position(int location) {
        positionValidation(location);
        this.location = location;
    }

    private void positionValidation(int location){
        if( location < 0 || location > 24 ){
            throw new IllegalArgumentException("0보다 작거나 24보다 클 수 없습니다");
        }
    }

    public int minusPostion(Position position){
        return this.location - position.location;
    }
}
