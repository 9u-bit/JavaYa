// Realizar un programa que lea los lados de n triángulos, e informar:
// a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
// b) Cantidad de triángulos de cada tipo.
// c) Tipo de triángulo que posee menor cantidad. 

import java.util.Scanner;

public class TiposTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de triángulos:");
        int cantidadTriangulos = scanner.nextInt();

        int equilateros = 0;
        int isosceles = 0;
        int escalenos = 0;

        for (int i = 1; i <= cantidadTriangulos; i++) {
            System.out.println("\nTriángulo " + i + ":");
            System.out.println("Ingrese el lado 1:");
            int lado1 = scanner.nextInt();

            System.out.println("Ingrese el lado 2:");
            int lado2 = scanner.nextInt();

            System.out.println("Ingrese el lado 3:");
            int lado3 = scanner.nextInt();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilátero.");
                equilateros++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo isósceles.");
                isosceles++;
            } else {
                System.out.println("Es un triángulo escaleno.");
                escalenos++;
            }
        }

        System.out.println("\nCantidad de triángulos equiláteros: " + equilateros);
        System.out.println("Cantidad de triángulos isósceles: " + isosceles);
        System.out.println("Cantidad de triángulos escalenos: " + escalenos);

        if (equilateros <= isosceles && equilateros <= escalenos) {
            System.out.println("El tipo de triángulo con menor cantidad es equilátero.");
        } else if (isosceles <= equilateros && isosceles <= escalenos) {
            System.out.println("El tipo de triángulo con menor cantidad es isósceles.");
        } else {
            System.out.println("El tipo de triángulo con menor cantidad es escaleno.");
        }

        scanner.close();
    }
}