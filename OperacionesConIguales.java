// Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo y a este resultado se lo multiplica por el tercero.

import java.util.Scanner;

public class OperacionesConIguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Ingrese el segundo valor:");
        int valor2 = scanner.nextInt();

        System.out.println("Ingrese el tercer valor:");
        int valor3 = scanner.nextInt();

        if (valor1 == valor2 && valor2 == valor3) {
            int suma = valor1 + valor2;
            int resultado = suma * valor3;

            System.out.println("Los tres valores son iguales.");
            System.out.println("La suma del primero y el segundo es: " + suma);
            System.out.println("El resultado de la multiplicación por el tercero es: " + resultado);
        } else {
            System.out.println("Los tres valores no son iguales. No se cumple la condición.");
        }

        scanner.close();
    }
}