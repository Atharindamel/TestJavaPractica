import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.ejercicio5;

public class ejercicio5Test {
    
    private InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
            System.setOut(new PrintStream(outputStreamCaptor));
        }

    @AfterEach
    public void tearDown(){
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

    @Test
    public void testObtenerNumero(){
        ByteArrayInputStream in = new ByteArrayInputStream("1\n".getBytes()); // El \n es como tomar un enter en la consola. En esta línea emulamos poner por consola un número, a los fines de poder probar el Scanner.
        System.setIn(in);
        int numero = ejercicio5.obtenerNumero();
        assertEquals(1, numero);
    }
    
    @Test
    void testMain() {
        int numero = 10;
        ByteArrayInputStream in = new ByteArrayInputStream((numero+"\n").getBytes());
        System.setIn(in);                                                                   //Arrange
        int doble = numero*2;
        int triple = numero*3;

        ejercicio5.main(new String[1]);                                                     //Act

        String salida = outputStreamCaptor.toString();
        String[] salidas = salida.split("\r\n");
        assertEquals("El doble de "+numero+" es "+doble, salidas[0]);                           //Assert
        assertEquals("El triple de "+numero+" es "+triple, salidas[1]);
    }
    
    @Test
    void testDuplicarNumero() {
        int resultado = ejercicio5.duplicarNumero(2);
        Assertions.assertEquals(4, resultado);
    }

    @Test
    void testTriplicarNumero() {
        int resultado = ejercicio5.triplicarNumero(2);
        Assertions.assertEquals(6, resultado);
    }

}
