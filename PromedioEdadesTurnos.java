// Se cuenta con la siguiente información:
// Las edades de 50 estudiantes del turno mañana.
// Las edades de 60 estudiantes del turno tarde.
// Las edades de 110 estudiantes del turno noche.
// Las edades de cada estudiante deben ingresarse por teclado.
// a) Obtener el promedio de las edades de cada turno (tres promedios)
// b) Imprimir dichos promedios (promedio de cada turno)
// c) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades menor. 

import java.util.Scanner;

public class PromedioEdadesTurnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaManana = 0;
        int sumaTarde = 0;
        int sumaNoche = 0;

        System.out.println("Ingreso de edades de estudiantes del turno mañana:");
        for (int i = 1; i <= 50; i++) {
            System.out.print("Ingrese la edad del estudiante " + i + ": ");
            int edad = scanner.nextInt();
            sumaManana += edad;
        }

        System.out.println("\nIngreso de edades de estudiantes del turno tarde:");
        for (int i = 1; i <= 60; i++) {
            System.out.print("Ingrese la edad del estudiante " + i + ": ");
            int edad = scanner.nextInt();
            sumaTarde += edad;
        }

        System.out.println("\nIngreso de edades de estudiantes del turno noche:");
        for (int i = 1; i <= 110; i++) {
            System.out.print("Ingrese la edad del estudiante " + i + ": ");
            int edad = scanner.nextInt();
            sumaNoche += edad;
        }

        double promedioManana = (double) sumaManana / 50;
        double promedioTarde = (double) sumaTarde / 60;
        double promedioNoche = (double) sumaNoche / 110;

        System.out.println("\nPromedio de edades del turno mañana: " + promedioManana);
        System.out.println("Promedio de edades del turno tarde: " + promedioTarde);
        System.out.println("Promedio de edades del turno noche: " + promedioNoche);

        if (promedioManana < promedioTarde && promedioManana < promedioNoche) {
            System.out.println("\nEl turno mañana tiene el menor promedio de edades.");
        } else if (promedioTarde < promedioManana && promedioTarde < promedioNoche) {
            System.out.println("\nEl turno tarde tiene el menor promedio de edades.");
        } else if (promedioNoche < promedioManana && promedioNoche < promedioTarde) {
            System.out.println("\nEl turno noche tiene el menor promedio de edades.");
        } else {
            System.out.println("\nHay al menos dos turnos con el mismo menor promedio de edades.");
        }

        scanner.close();
    }
}