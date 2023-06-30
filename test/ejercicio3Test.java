

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.ejercicio3;

public class ejercicio3Test {
    
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
        ejercicio3.main(new String[1]);
        String salida = outputStreamCaptor.toString();
        String[] salidas = salida.split("\r\n");
        assertEquals("El doble de 15 es 30", salidas[0]);
        assertEquals("El triple de 15 es 45", salidas[1]);
        // OPCIÓN 2: assertTrue(salida.contains("El doble de 15 es 30\r\n"));
        // assertTrue(salida.contains("El triple de 15 es 45\r\n"));
        // OPCIÓN 3: assertEquals("El doble de 15 es 30\r\n", salida); //Para que reconozca los saltos de línea (el "ln" en los syso) se debe colocar \r\n dentro del comillado. Se incorpora también el assertTrue para considerar los dos print del programa
    }
    
    @Test
    void testDuplicar() {
        Integer resultado = ejercicio3.duplicar(2);
        Assertions.assertEquals(4, resultado);
    }

    @Test
    void testTriplicar() {
        Integer resultado = ejercicio3.triplicar(2);
        Assertions.assertEquals(6, resultado);
    }

}
