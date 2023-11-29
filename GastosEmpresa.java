// En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea los sueldos que cobra cada empleado e informe cu�ntos empleados cobran entre $100 y $300 y cu�ntos cobran m�s de $300. Adem�s el programa deber� informar el importe que gasta la empresa en sueldos al personal.

import java.util.Scanner;

public class GastosEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de empleados:");
        int cantidadEmpleados = scanner.nextInt();

        int empleados100a300 = 0;
        int empleadosMas300 = 0;
        double gastosTotales = 0;

        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.println("Ingrese el sueldo del empleado " + i + ":");
            double sueldo = scanner.nextDouble();

            if (sueldo >= 100 && sueldo <= 300) {
                empleados100a300++;
            } else if (sueldo > 300) {
                empleadosMas300++;
            }

            gastosTotales += sueldo;
        }

        System.out.println("Empleados que cobran entre $100 y $300: " + empleados100a300);
        System.out.println("Empleados que cobran m�s de $300: " + empleadosMas300);

        System.out.println("Gastos totales en sueldos: $" + gastosTotales);

        scanner.close();
    }
}