// Realizar un programa que permita cargar dos listas de 15 valores cada una. Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
// Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo. 

import java.util.Scanner;

public class CompararListas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lista1 = new int[15];
        int[] lista2 = new int[15];

        System.out.println("Ingrese los 15 valores de la Lista 1:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            lista1[i] = scanner.nextInt();
        }

        System.out.println("\nIngrese los 15 valores de la Lista 2:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            lista2[i] = scanner.nextInt();
        }

        int acumuladoLista1 = 0;
        for (int valor : lista1) {
            acumuladoLista1 += valor;
        }

        int acumuladoLista2 = 0;
        for (int valor : lista2) {
            acumuladoLista2 += valor;
        }

        if (acumuladoLista1 > acumuladoLista2) {
            System.out.println("\nLista 1 mayor");
        } else if (acumuladoLista2 > acumuladoLista1) {
            System.out.println("\nLista 2 mayor");
        } else {
            System.out.println("\nListas iguales");
        }

        scanner.close();
    }
}