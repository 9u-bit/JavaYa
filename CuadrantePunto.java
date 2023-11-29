// Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero).
// Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.) 

import java.util.Scanner;

public class CuadrantePunto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la coordenada x del punto:");
        int x = scanner.nextInt();

        System.out.println("Ingrese la coordenada y del punto:");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("El punto se encuentra en el 1er Cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto se encuentra en el 2do Cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto se encuentra en el 3er Cuadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto se encuentra en el 4to Cuadrante.");
        } else {
            System.out.println("El punto se encuentra sobre un eje o en el origen.");
        }

        scanner.close();
    }
}