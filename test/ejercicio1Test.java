import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import src.ejercicio1;

public class ejercicio1Test {
    @Test
    void testDoble() {
        Integer resultado = ejercicio1.doble(2);
        Assertions.assertEquals(4, resultado);
    }
}
