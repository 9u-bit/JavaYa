// Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el curso B, cada curso cuenta con 5 alumnos.
// Realizar un programa que muestre el curso que obtuvo el mayor promedio general. 

import java.util.Scanner;

public class MayorPromedioCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alumnos = 5;
        double sumaPromediosCursoA = 0;
        double sumaPromediosCursoB = 0;

        System.out.println("Ingrese las notas del curso A:");
        for (int i = 1; i <= alumnos; i++) {
            double sumaNotas = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.print("Ingrese la nota " + j + " del alumno " + i + ": ");
                double nota = scanner.nextDouble();
                sumaNotas += nota;
            }
            double promedio = sumaNotas / 3;
            sumaPromediosCursoA += promedio;
        }
        double promedioCursoA = sumaPromediosCursoA / alumnos;

        System.out.println("\nIngrese las notas del curso B:");
        for (int i = 1; i <= alumnos; i++) {
            double sumaNotas = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.print("Ingrese la nota " + j + " del alumno " + i + ": ");
                double nota = scanner.nextDouble();
                sumaNotas += nota;
            }
            double promedio = sumaNotas / 3;
            sumaPromediosCursoB += promedio;
        }
        double promedioCursoB = sumaPromediosCursoB / alumnos;

        if (promedioCursoA > promedioCursoB) {
            System.out.println("\nEl curso A tiene un mayor promedio general.");
        } else if (promedioCursoB > promedioCursoA) {
            System.out.println("\nEl curso B tiene un mayor promedio general.");
        } else {
            System.out.println("\nAmbos cursos tienen el mismo promedio general.");
        }

        scanner.close();
    }
}