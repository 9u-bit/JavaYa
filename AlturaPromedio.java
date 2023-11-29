// Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas. 

import java.util.Scanner;

public class AlturaPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alturas:");
        int cantidadAlturas = scanner.nextInt();

        double sumaAlturas = 0;

        for (int i = 1; i <= cantidadAlturas; i++) {
            System.out.println("Ingrese la altura " + i + ":");
            double altura = scanner.nextDouble();
            sumaAlturas += altura;
        }

        double promedioAlturas = sumaAlturas / cantidadAlturas;

        System.out.println("La altura promedio de las personas es: " + promedioAlturas);

        scanner.close();
    }
}