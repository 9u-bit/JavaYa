// Realizar un programa que lea los lados de n tri�ngulos, e informar:
// a) De cada uno de ellos, qu� tipo de tri�ngulo es: equil�tero (tres lados iguales), is�sceles (dos lados iguales), o escaleno (ning�n lado igual)
// b) Cantidad de tri�ngulos de cada tipo.
// c) Tipo de tri�ngulo que posee menor cantidad. 

import java.util.Scanner;

public class TiposTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de tri�ngulos:");
        int cantidadTriangulos = scanner.nextInt();

        int equilateros = 0;
        int isosceles = 0;
        int escalenos = 0;

        for (int i = 1; i <= cantidadTriangulos; i++) {
            System.out.println("\nTri�ngulo " + i + ":");
            System.out.println("Ingrese el lado 1:");
            int lado1 = scanner.nextInt();

            System.out.println("Ingrese el lado 2:");
            int lado2 = scanner.nextInt();

            System.out.println("Ingrese el lado 3:");
            int lado3 = scanner.nextInt();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un tri�ngulo equil�tero.");
                equilateros++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un tri�ngulo is�sceles.");
                isosceles++;
            } else {
                System.out.println("Es un tri�ngulo escaleno.");
                escalenos++;
            }
        }

        System.out.println("\nCantidad de tri�ngulos equil�teros: " + equilateros);
        System.out.println("Cantidad de tri�ngulos is�sceles: " + isosceles);
        System.out.println("Cantidad de tri�ngulos escalenos: " + escalenos);

        if (equilateros <= isosceles && equilateros <= escalenos) {
            System.out.println("El tipo de tri�ngulo con menor cantidad es equil�tero.");
        } else if (isosceles <= equilateros && isosceles <= escalenos) {
            System.out.println("El tipo de tri�ngulo con menor cantidad es is�sceles.");
        } else {
            System.out.println("El tipo de tri�ngulo con menor cantidad es escaleno.");
        }

        scanner.close();
    }
}