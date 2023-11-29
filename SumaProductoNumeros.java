// Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto. 

import java.util.Scanner;

public class SumaProductoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double num3 = scanner.nextDouble();

        System.out.println("Ingrese el cuarto número:");
        double num4 = scanner.nextDouble();

        double suma = num1 + num2;

        double producto = num3 * num4;

        System.out.println("La suma de los dos primeros números es: " + suma);
        System.out.println("El producto del tercer y cuarto número es: " + producto);

        scanner.close();
    }
}