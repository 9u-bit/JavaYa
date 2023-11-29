// Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna (es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
// Imprimir luego la matriz. 

import java.util.Scanner;

public class MatrizCargaColumnas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][5];

        System.out.println("Ingrese los valores de la matriz por columnas:");

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 2; i++) {
                System.out.print("Ingrese el valor para la columna " + (j + 1) + " fila " + (i + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}