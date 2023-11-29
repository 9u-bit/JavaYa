// Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
// a) La cantidad de valores ingresados negativos.
// b) La cantidad de valores ingresados positivos.
// c) La cantidad de múltiplos de 15.
// d) El valor acumulado de los números ingresados que son pares. 

import java.util.Scanner;

public class AnalisisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadMultiplos15 = 0;
        int acumuladoPares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                cantidadNegativos++;
            } else if (numero > 0) {
                cantidadPositivos++;
            }

            if (numero % 15 == 0) {
                cantidadMultiplos15++;
            }

            if (numero % 2 == 0) {
                acumuladoPares += numero;
            }
        }

        System.out.println("Cantidad de valores ingresados negativos: " + cantidadNegativos);
        System.out.println("Cantidad de valores ingresados positivos: " + cantidadPositivos);
        System.out.println("Cantidad de múltiplos de 15: " + cantidadMultiplos15);
        System.out.println("Valor acumulado de los números pares ingresados: " + acumuladoPares);

        scanner.close();
    }
}