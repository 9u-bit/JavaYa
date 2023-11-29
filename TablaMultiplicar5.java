// Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50) 

public class TablaMultiplicar5 {
    public static void main(String[] args) {
        int numero = 5;
        int limite = 50;

        System.out.println("Tabla de multiplicar del 5:");

        for (int i = 1; i <= limite / numero; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}