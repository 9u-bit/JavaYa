// Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
// Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36. 

import java.util.Scanner;

public class TablaMultiplicarPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 10:");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabla de multiplicar del " + numero + ":");

            for (int i = 1; i <= 12; i++) {
                int resultado = numero * i;
                System.out.print(resultado + " ");
            }
        } else {
            System.out.println("El número ingresado está fuera del rango permitido.");
        }

        scanner.close();
    }
}