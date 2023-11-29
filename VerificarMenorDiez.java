// Se ingresan por teclado tres n�meros, si al menos uno de los valores ingresados es menor a 10, imprimir en pantalla la leyenda "Alguno de los n�meros es menor a diez".

import java.util.Scanner;

public class VerificarMenorDiez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer n�mero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo n�mero:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer n�mero:");
        int num3 = scanner.nextInt();

        if (num1 < 10 || num2 < 10 || num3 < 10) {
            System.out.println("Alguno de los n�meros es menor a diez.");
        } else {
            System.out.println("Ninguno de los n�meros es menor a diez.");
        }

        scanner.close();
    }
}