// Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado". 

import java.util.Scanner;

public class VerificarPromocion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Ingrese la segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Ingrese la tercera nota:");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7.0) {
            System.out.println("Promocionado");
        } else {
            System.out.println("No alcanza para promocionar");
        }

        scanner.close();
    }
}