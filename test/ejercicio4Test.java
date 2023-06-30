
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.ejercicio4;

public class ejercicio4Test {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    @BeforeEach
    public void setUp(){
            System.setOut(new PrintStream(outputStreamCaptor));
        }

    @AfterEach
    public void tearDown(){
        System.setOut(standardOut);
    }

    @Test
    void testMain() {
        ejercicio4.main(new String[0]);
        String salida = outputStreamCaptor.toString();
        assertEquals("¡Hola Leonel, tengo entendido que tenés 38 años!\r\n", salida);
    }
}
