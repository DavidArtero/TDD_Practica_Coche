import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCoche {

    private Coche nuevoCoche = new Coche();


    @Test
    void test_al_crear_coche_velocidad_cero(){
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

    @Test
    void test_acelerar_coche_velocidad_aumenta(){
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    void test_decelerar_coche_velocidad_disminuye(){
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    void test_al_crear_coche_no_menor_cero(){
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

}
