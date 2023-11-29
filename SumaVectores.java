// Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos. Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer vector del mismo tamaño. Sumar componente a componente. 

import java.util.Scanner;

public class SumaVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        int[] vectorSuma = new int[4];

        System.out.println("Ingrese los 4 elementos del primer vector:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        System.out.println("\nIngrese los 4 elementos del segundo vector:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }

        for (int i = 0; i < vectorSuma.length; i++) {
            vectorSuma[i] = vector1[i] + vector2[i];
        }

        System.out.println("\nEl resultado de la suma de los dos vectores es:");
        for (int i = 0; i < vectorSuma.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vectorSuma[i]);
        }

        scanner.close();
    }
}