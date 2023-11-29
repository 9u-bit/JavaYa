// Realizar un programa que lea por teclado dos n�meros, si el primero es mayor al segundo informar su suma y diferencia, en caso contrario informar el producto y la divisi�n del primero respecto al segundo. 

import java.util.Scanner;

public class OperacionesNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer n�mero:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo n�mero:");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            double suma = num1 + num2;
            double diferencia = num1 - num2;

            System.out.println("La suma de los n�meros es: " + suma);
            System.out.println("La diferencia de los n�meros es: " + diferencia);
        } else {
            double producto = num1 * num2;
            double division = num1 / num2;

            System.out.println("El producto de los n�meros es: " + producto);
            System.out.println("La divisi�n de los n�meros es: " + division);
        }

        scanner.close();
    }
}