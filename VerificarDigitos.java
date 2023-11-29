// Se ingresa por teclado un n�mero positivo de uno o dos d�gitos (1..99) mostrar un mensaje indicando si el n�mero tiene uno o dos d�gitos.
//(Tener en cuenta que condici�n debe cumplirse para tener dos d�gitos, un n�mero entero) 

import java.util.Scanner;

public class VerificarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un n�mero entre 1 y 99:");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("El n�mero tiene un d�gito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El n�mero tiene dos d�gitos.");
        } else {
            System.out.println("El n�mero ingresado est� fuera del rango v�lido.");
        }

        scanner.close();
    }
}