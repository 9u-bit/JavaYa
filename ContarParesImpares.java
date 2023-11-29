// Desarrollar un programa que permita cargar n n�meros enteros y luego nos informe cu�ntos valores fueron pares y cu�ntos impares.
// Emplear el operador % en la condici�n de la estructura condicional:
// if (valor%2==0)         //Si el if da verdadero luego es par.

import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de n�meros a ingresar:");
        int n = scanner.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el n�mero " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de n�meros pares: " + pares);
        System.out.println("Cantidad de n�meros impares: " + impares);

        scanner.close();
    }
}