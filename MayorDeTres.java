// Se cargan por teclado tres n�meros distintos. Mostrar por pantalla el mayor de ellos. 

import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer n�mero:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo n�mero:");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer n�mero:");
        double num3 = scanner.nextDouble();

        double mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El n�mero mayor es: " + mayor);

        scanner.close();
    }
}