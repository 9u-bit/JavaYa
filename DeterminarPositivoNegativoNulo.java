// Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el n�mero es positivo, nulo o negativo. 

import java.util.Scanner;

public class DeterminarPositivoNegativoNulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un n�mero entero:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El n�mero es positivo.");
        } else if (numero < 0) {
            System.out.println("El n�mero es negativo.");
        } else {
            System.out.println("El n�mero es nulo.");
        }

        scanner.close();
    }
}