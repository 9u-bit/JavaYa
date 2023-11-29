// Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule e informe su rango de variación (debe mostrar el mayor y el menor de ellos) 

import java.util.Scanner;

public class RangoVariacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo valor:");
        double valor2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer valor:");
        double valor3 = scanner.nextDouble();

        double mayor = valor1;
        double menor = valor1;

        if (valor2 > mayor) {
            mayor = valor2;
        } else if (valor2 < menor) {
            menor = valor2;
        }

        if (valor3 > mayor) {
            mayor = valor3;
        } else if (valor3 < menor) {
            menor = valor3;
        }

        System.out.println("El rango de variación es:");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}