// Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. Imprimir luego la matriz. 

import java.util.Scanner;

public class IntercambioFilasMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        System.out.println("Ingrese los valores de la matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese el valor para la fila " + (i + 1) + " columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        if (n > 1) {
            int[] temp = matriz[0];
            matriz[0] = matriz[1];
            matriz[1] = temp;
        } else {
            System.out.println("La matriz tiene menos de 2 filas. No se pueden intercambiar.");
        }

        System.out.println("\nMatriz con la primera fila intercambiada con la segunda:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}