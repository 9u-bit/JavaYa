// Cargar un vector de n elementos. imprimir el menor y un mensaje si se repite dentro del vector.

import java.util.Scanner;

public class MenorYRepetido {
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

        int menor = vector[0];
        for (int i = 1; i < n; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        boolean seRepite = false;
        for (int i = 0; i < n; i++) {
            if (vector[i] == menor && i != 0) {
                seRepite = true;
                break;
            }
        }

        System.out.println("El menor valor en el vector es: " + menor);

        if (seRepite) {
            System.out.println("El menor valor se repite dentro del vector.");
        } else {
            System.out.println("El menor valor no se repite dentro del vector.");
        }

        scanner.close();
    }
}