// Cargar un vector de n elementos de tipo entero. Ordenar posteriormente el vector. 

import java.util.Scanner;

public class OrdenarVector {
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

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        System.out.println("El vector ordenado es:");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }

        scanner.close();
    }
}