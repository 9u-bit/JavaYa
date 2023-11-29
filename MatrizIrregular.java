// Confeccionar una clase para administrar una matriz irregular de 5 filas y 1 columna la primer fila, 2 columnas la segunda fila y así sucesivamente hasta 5 columnas la última fila (crearla sin la intervención del operador)
// Realizar la carga por teclado e imprimir posteriormente. 

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][];

        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.print("Ingrese el número de columnas para la fila " + (fila + 1) + ": ");
            int numColumnas = scanner.nextInt();

            matriz[fila] = new int[numColumnas];

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print("Ingrese el valor para la posición [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz ingresada:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}