// Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez". 

import java.util.Scanner;

public class VerificarMenoresDiez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();

        if (num1 < 10 && num2 < 10 && num3 < 10) {
            System.out.println("Todos los números son menores a diez.");
        } else {
            System.out.println("Al menos uno de los números no es menor a diez.");
        }

        scanner.close();
    }
}