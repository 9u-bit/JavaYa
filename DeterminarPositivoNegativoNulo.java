// Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo. 

import java.util.Scanner;

public class DeterminarPositivoNegativoNulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es nulo.");
        }

        scanner.close();
    }
}