// Cargar un vector de 10 elementos y verificar posteriormente si el mismo está ordenado de menor a mayor. 

import java.util.Scanner;

public class VerificarOrden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[10];

        System.out.println("Ingrese 10 elementos para el vector:");

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        boolean ordenado = true;
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado) {
            System.out.println("El vector está ordenado de menor a mayor.");
        } else {
            System.out.println("El vector no está ordenado de menor a mayor.");
        }

        scanner.close();
    }
}