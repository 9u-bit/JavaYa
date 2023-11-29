// Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
// El valor acumulado de todos los elementos del vector.
// El valor acumulado de los elementos del vector que sean mayores a 36.
// Cantidad de valores mayores a 50.

import java.util.Scanner;

public class AnalisisVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[8];
        int acumuladoTotal = 0;
        int acumuladoMayores36 = 0;
        int cantidadMayores50 = 0;

        System.out.println("Ingrese los 8 elementos del vector:");

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
            acumuladoTotal += vector[i];

            if (vector[i] > 36) {
                acumuladoMayores36 += vector[i];
            }

            if (vector[i] > 50) {
                cantidadMayores50++;
            }
        }

        System.out.println("\nValor acumulado de todos los elementos del vector: " + acumuladoTotal);
        System.out.println("Valor acumulado de elementos mayores a 36: " + acumuladoMayores36);
        System.out.println("Cantidad de valores mayores a 50: " + cantidadMayores50);

        scanner.close();
    }
}