import car.Avante;
import car.Car;
import car.K5;
import car.Sonata;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    @Test
    void AvanteCalculate(){
        Car avante = new Avante(150);
        double oil = avante.calculateLiter();
        assertThat(oil).isEqualTo(10);
    }

    @Test
    void SonataCalculate(){
        Car sonata = new Sonata(390);
        double oil = sonata.calculateLiter();
        assertThat(oil).isEqualTo(39);
    }

    @Test
    void K5Calculate(){
        Car k5 = new K5(390);
        double oil = k5.calculateLiter();
        assertThat(oil).isEqualTo(30);
    }
}
