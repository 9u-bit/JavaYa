// Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
// Nivel máximo:	Porcentaje>=90%.
// Nivel medio:	Porcentaje>=75% y <90%.
// Nivel regular:	Porcentaje>=50% y <75%.
// Fuera de nivel:	Porcentaje<50%.

import java.util.Scanner;

public class NivelPostulante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad total de preguntas:");
        int totalPreguntas = scanner.nextInt();

        System.out.println("Ingrese la cantidad de preguntas respondidas correctamente:");
        int preguntasCorrectas = scanner.nextInt();

        double porcentajeCorrectas = (preguntasCorrectas * 100.0) / totalPreguntas;

        if (porcentajeCorrectas >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentajeCorrectas >= 75) {
            System.out.println("Nivel medio");
        } else if (porcentajeCorrectas >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }

        scanner.close();
    }
}