// Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio. 

import java.util.Scanner;

public class SumaPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo valor:");
        double valor2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer valor:");
        double valor3 = scanner.nextDouble();

        System.out.println("Ingrese el cuarto valor:");
        double valor4 = scanner.nextDouble();

        double suma = valor1 + valor2 + valor3 + valor4;

        double promedio = suma / 4;

        System.out.println("La suma de los valores es: " + suma);
        System.out.println("El promedio de los valores es: " + promedio);

        scanner.close();
    }
}