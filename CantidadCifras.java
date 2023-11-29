// Confeccionar un programa que permita cargar un n�mero entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el n�mero de cifras es mayor. 

import java.util.Scanner;

public class CantidadCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un n�mero entero positivo de hasta tres cifras:");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("El n�mero tiene 1 cifra.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El n�mero tiene 2 cifras.");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("El n�mero tiene 3 cifras.");
        } else {
            System.out.println("Error: El n�mero tiene m�s de tres cifras.");
        }

        scanner.close();
    }
}