// Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia, en caso contrario informar el producto y la división del primero respecto al segundo. 

import java.util.Scanner;

public class OperacionesNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            double suma = num1 + num2;
            double diferencia = num1 - num2;

            System.out.println("La suma de los números es: " + suma);
            System.out.println("La diferencia de los números es: " + diferencia);
        } else {
            double producto = num1 * num2;
            double division = num1 / num2;

            System.out.println("El producto de los números es: " + producto);
            System.out.println("La división de los números es: " + division);
        }

        scanner.close();
    }
}