// Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga). Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero. 

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorIngresado;
        int acumulado = 0;

        System.out.println("Ingrese valores a acumular (ingrese 9999 para finalizar):");

        do {
            System.out.print("Ingrese un valor: ");
            valorIngresado = scanner.nextInt();

            if (valorIngresado != 9999) {
                acumulado += valorIngresado;
            }

        } while (valorIngresado != 9999);

        System.out.println("El valor acumulado es: " + acumulado);

        if (acumulado == 0) {
            System.out.println("El valor acumulado es cero.");
        } else if (acumulado > 0) {
            System.out.println("El valor acumulado es mayor a cero.");
        } else {
            System.out.println("El valor acumulado es menor a cero.");
        }

        scanner.close();
    }
}