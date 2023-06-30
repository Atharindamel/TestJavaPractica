package src;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        int numeroEntrada = solicitarNumero();
        if (chequearPar(numeroEntrada)){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    public static int solicitarNumero() {
        System.out.print("Ingrese un número entero: ");
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }

    public static boolean chequearPar(int numero) {
        if (numero%2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
