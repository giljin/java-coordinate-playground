import coordinate.Position;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class PositionTest {

    @Test
    void create(){
        assertThatThrownBy(() -> new Position(25))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
