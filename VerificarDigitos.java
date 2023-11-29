// Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando si el número tiene uno o dos dígitos.
//(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero) 

import java.util.Scanner;

public class VerificarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 y 99:");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("El número tiene un dígito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número tiene dos dígitos.");
        } else {
            System.out.println("El número ingresado está fuera del rango válido.");
        }

        scanner.close();
    }
}