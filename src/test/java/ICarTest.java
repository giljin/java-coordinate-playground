import car.impl.AvanteImpl;
import car.ICar;
import car.impl.K5Impl;
import car.impl.SonataImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ICarTest {
    @Test
    void iSonataCalculate(){
        ICar iSonata = new SonataImpl(300);
        assertThat(iSonata.calculateLiter()).isEqualTo(30);
    }

    @Test
    void iK5Calculate(){
        ICar iK5 = new K5Impl(260);
        assertThat(iK5.calculateLiter()).isEqualTo(20);
    }

    @Test
    void iAvanteCalculate(){
        ICar iAvante = new AvanteImpl(300);
        assertThat(iAvante.calculateLiter()).isEqualTo(20);
    }
}
