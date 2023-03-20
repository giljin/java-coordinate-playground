package coordinate;

public class Position {

    public Position(int x) {
        positionValidation(x);
    }

    private void positionValidation(int x){
        if( x < 0 || x > 24 ){
            throw new IllegalArgumentException("0보다 작거나 24보다 클 수 없습니다");
        }
    }
}
