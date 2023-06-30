//package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.ejercicio6;

public class ejercicio6Test {
    
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
    void testMain() {
        String mensajePar = "El número es par";
        String mensajeImpar = "El número es impar";

        ByteArrayOutputStream outputStreamPar = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamPar));
        ejercicio6.main(new String[]{});
        String actualOutputPar = outputStreamPar.toString().trim();

        ByteArrayOutputStream outputStreamImpar = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamImpar));
        ejercicio6.main(new String[]{});
        String actualOutputImpar = outputStreamImpar.toString().trim();

        Assertions.assertAll(
            () -> Assertions.assertEquals(mensajePar, actualOutputPar);
            () -> Assertions.assertEquals(mensajeImpar, actualOutputImpar);
        );
    }

    @Test
    void testChequearPar() {
        int numeroPar = 4;
        int numeroImpar = 5;

        boolean resultadoPar = ejercicio6.chequearPar(numeroPar);
        boolean resultadoImpar = ejercicio6.chequearPar(numeroImpar);

        Assertions.assertTrue(resultadoPar);
        Assertions.assertFalse(resultadoImpar);
    }

    @Test
    void testSolicitarNumero() {
        ByteArrayInputStream in = new ByteArrayInputStream("1\n".getBytes());
        System.setIn(in);
        int numero = ejercicio6.solicitarNumero();
        assertEquals(1, numero);
    }
}
