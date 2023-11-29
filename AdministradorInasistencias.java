// Confeccionar una clase para administrar los días que han faltado los 3 empleados de una empresa.
// Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz irregular para cargar los días que han faltado cada empleado (cargar el número de día que faltó)
// Cada fila de la matriz representan los días de cada empleado.
// Mostrar los empleados con la cantidad de inasistencias.
// Cuál empleado faltó menos días. 

import java.util.Scanner;

public class AdministradorInasistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombresEmpleados = new String[3];

        int[][] diasFaltados = new int[3][];

        for (int i = 0; i < nombresEmpleados.length; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombresEmpleados[i] = scanner.nextLine();

            System.out.print("Ingrese la cantidad de días que " + nombresEmpleados[i] + " ha faltado: ");
            int numDiasFaltados = scanner.nextInt();

            diasFaltados[i] = new int[numDiasFaltados];

            for (int j = 0; j < diasFaltados[i].length; j++) {
                System.out.print("Ingrese el día que faltó el empleado " + nombresEmpleados[i] + ": ");
                diasFaltados[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        System.out.println("\nEmpleados con cantidad de inasistencias:");
        for (int i = 0; i < nombresEmpleados.length; i++) {
            System.out.println(nombresEmpleados[i] + ": " + diasFaltados[i].length + " días");
        }

        int menorInasistencias = Integer.MAX_VALUE;
        int indexEmpleadoMenosInasistencias = -1;

        for (int i = 0; i < diasFaltados.length; i++) {
            if (diasFaltados[i].length < menorInasistencias) {
                menorInasistencias = diasFaltados[i].length;
                indexEmpleadoMenosInasistencias = i;
            }
        }

        System.out.println("\nEl empleado con menos días de inasistencia es: " + nombresEmpleados[indexEmpleadoMenosInasistencias]);
    }
}