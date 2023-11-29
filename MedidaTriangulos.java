// Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un tri�ngulo. El programa deber� informar:
// a) De cada tri�ngulo la medida de su base, su altura y su superficie.
// b) La cantidad de tri�ngulos cuya superficie es mayor a 12. 

import java.util.Scanner;

public class MedidaTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de tri�ngulos:");
        int cantidadTriangulos = scanner.nextInt();

        int cantidadSuperficieMayor12 = 0;

        for (int i = 1; i <= cantidadTriangulos; i++) {
            System.out.println("\nTri�ngulo " + i + ":");

            System.out.println("Ingrese la medida de la base:");
            double base = scanner.nextDouble();

            System.out.println("Ingrese la medida de la altura:");
            double altura = scanner.nextDouble();

            double superficie = (base * altura) / 2;

            System.out.println("Base del tri�ngulo: " + base);
            System.out.println("Altura del tri�ngulo: " + altura);
            System.out.println("Superficie del tri�ngulo: " + superficie);

            if (superficie > 12) {
                cantidadSuperficieMayor12++;
            }
        }

        System.out.println("\nCantidad de tri�ngulos con superficie mayor a 12: " + cantidadSuperficieMayor12);

        scanner.close();
    }
}