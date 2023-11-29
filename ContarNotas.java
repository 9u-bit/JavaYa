// Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores. 

import java.util.Scanner;

public class ContarNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notasMayoresOIgualesA7 = 0;
        int notasMenoresA7 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese la nota del alumno " + i + ":");
            double nota = scanner.nextDouble();

            if (nota >= 7) {
                notasMayoresOIgualesA7++;
            } else {
                notasMenoresA7++;
            }
        }

        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + notasMayoresOIgualesA7);
        System.out.println("Cantidad de alumnos con notas menores a 7: " + notasMenoresA7);

        scanner.close();
    }
}