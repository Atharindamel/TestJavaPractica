package src;

public class ejercicio3 {
    public static void main(String[] args) {
        int numero = 15;
        System.out.println("El doble de 15 es "+ duplicar(numero));
        System.out.println("El triple de 15 es "+ triplicar(numero));
    }

    public static int duplicar(int numero) {
        return numero * 2;
    }

    public static int triplicar(int numero) {
        return numero * 3;
    }
}
