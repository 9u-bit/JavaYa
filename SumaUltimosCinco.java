// Desarrollar un programa que solicite la carga de 10 n�meros e imprima la suma de los �ltimos 5 valores ingresados. 

import java.util.Scanner;

public class SumaUltimosCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 10;
        int sumaUltimosCinco = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Ingrese el n�mero " + i + ": ");
            int numero = scanner.nextInt();

            if (i > totalNumeros - 5) {
                sumaUltimosCinco += numero;
            }
        }

        System.out.println("La suma de los �ltimos 5 n�meros ingresados es: " + sumaUltimosCinco);

        scanner.close();
    }
}