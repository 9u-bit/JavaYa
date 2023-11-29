// Se ingresan por teclado tres n�meros, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda "Todos los n�meros son menores a diez". 

import java.util.Scanner;

public class VerificarMenoresDiez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer n�mero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo n�mero:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer n�mero:");
        int num3 = scanner.nextInt();

        if (num1 < 10 && num2 < 10 && num3 < 10) {
            System.out.println("Todos los n�meros son menores a diez.");
        } else {
            System.out.println("Al menos uno de los n�meros no es menor a diez.");
        }

        scanner.close();
    }
}