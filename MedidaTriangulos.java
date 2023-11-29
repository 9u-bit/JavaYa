// Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. El programa deberá informar:
// a) De cada triángulo la medida de su base, su altura y su superficie.
// b) La cantidad de triángulos cuya superficie es mayor a 12. 

import java.util.Scanner;

public class MedidaTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de triángulos:");
        int cantidadTriangulos = scanner.nextInt();

        int cantidadSuperficieMayor12 = 0;

        for (int i = 1; i <= cantidadTriangulos; i++) {
            System.out.println("\nTriángulo " + i + ":");

            System.out.println("Ingrese la medida de la base:");
            double base = scanner.nextDouble();

            System.out.println("Ingrese la medida de la altura:");
            double altura = scanner.nextDouble();

            double superficie = (base * altura) / 2;

            System.out.println("Base del triángulo: " + base);
            System.out.println("Altura del triángulo: " + altura);
            System.out.println("Superficie del triángulo: " + superficie);

            if (superficie > 12) {
                cantidadSuperficieMayor12++;
            }
        }

        System.out.println("\nCantidad de triángulos con superficie mayor a 12: " + cantidadSuperficieMayor12);

        scanner.close();
    }
}