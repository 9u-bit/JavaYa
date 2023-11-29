// Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor. 

import java.util.Scanner;

public class CantidadCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo de hasta tres cifras:");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("El número tiene 1 cifra.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número tiene 2 cifras.");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("El número tiene 3 cifras.");
        } else {
            System.out.println("Error: El número tiene más de tres cifras.");
        }

        scanner.close();
    }
}