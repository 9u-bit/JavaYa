// Escribir un programa en el cual se ingresen cuatro n�meros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto. 

import java.util.Scanner;

public class SumaProductoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer n�mero:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo n�mero:");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer n�mero:");
        double num3 = scanner.nextDouble();

        System.out.println("Ingrese el cuarto n�mero:");
        double num4 = scanner.nextDouble();

        double suma = num1 + num2;

        double producto = num3 * num4;

        System.out.println("La suma de los dos primeros n�meros es: " + suma);
        System.out.println("El producto del tercer y cuarto n�mero es: " + producto);

        scanner.close();
    }
}