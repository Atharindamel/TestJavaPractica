package src;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int numero = obtenerNumero();
        System.out.println("El doble de "+numero+" es "+duplicarNumero(numero));
        System.out.println("El triple de "+numero+" es "+triplicarNumero(numero));
    }

    public static int obtenerNumero() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }

    public static int duplicarNumero(int numero) {
        return numero*2;
    }
    
    public static int triplicarNumero(int numero) {
        return numero*3;
    }
}
