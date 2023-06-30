import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import src.ejercicio2;

public class ejercicio2Test {
    @Test
    void testDuplicar() {
        Integer resultado = ejercicio2.duplicar(2);
        Assertions.assertEquals(4, resultado);
    }

    @Test
    void testTriplicar() {
        Integer resultado = ejercicio2.triplicar(2);
        Assertions.assertEquals(6, resultado);
    }
}
