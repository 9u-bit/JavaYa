// Desarrollar un programa que permita ingresar un vector de n elementos, ingresar n por teclado. Luego imprimir la suma de todos sus elementos 

import java.util.Scanner;

public class SumaVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        System.out.println("Ingrese " + n + " elementos para el vector:");

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }

        System.out.println("La suma de todos los elementos del vector es: " + suma);

        scanner.close();
    }
}