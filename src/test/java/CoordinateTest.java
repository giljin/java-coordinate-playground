import coordinate.Coordinate;
import coordinate.Position;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

public class CoordinateTest {

    @Test
    void calculate(){
        Coordinate coor = new Coordinate(new Position(10), new Position(10));
        Coordinate coor2 = new Coordinate(new Position(14), new Position(15));

        double test = coor.calculateDistance(coor2);
        System.out.println(test);
        assertThat(test).isEqualTo(6.403124, offset(0.00099));
    }
}
