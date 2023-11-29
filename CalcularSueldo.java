// De un operario se conoce su sueldo y los a�os de antig�edad. Se pide confeccionar un programa que lea los datos de entrada e informe:
// a) Si el sueldo es inferior a 500 y su antig�edad es igual o superior a 10 a�os, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
// b)Si el sueldo es inferior a 500 pero su antig�edad es menor a 10 a�os, otorgarle un aumento de 5 %.
// c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios. 

import java.util.Scanner;

public class CalcularSueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el sueldo del operario:");
        double sueldo = scanner.nextDouble();

        System.out.println("Ingrese los a�os de antig�edad del operario:");
        int antiguedad = scanner.nextInt();

        if (sueldo < 500) {
            if (antiguedad >= 10) {
                sueldo *= 1.2;
            } else {
                sueldo *= 1.05;
            }
        }

        System.out.println("El sueldo a pagar es: " + sueldo);

        scanner.close();
    }
}