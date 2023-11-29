// Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir los cuatro valores que se encuentran en los vértices de la misma (mat[0][0] etc.) 

import java.util.Scanner;

public class VerticesMatriz {
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

        System.out.println("\nValores de los vértices de la matriz:");
        System.out.println("Esquina superior izquierda: " + matriz[0][0]);
        System.out.println("Esquina superior derecha: " + matriz[0][m - 1]);
        System.out.println("Esquina inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Esquina inferior derecha: " + matriz[n - 1][m - 1]);

        scanner.close();
    }
}