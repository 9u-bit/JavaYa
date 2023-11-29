// Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
// Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante. Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar. 

import java.util.Scanner;

public class CuadrantesCoordenadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de puntos a procesar:");
        int cantidadPuntos = scanner.nextInt();

        int primerCuadrante = 0;
        int segundoCuadrante = 0;
        int tercerCuadrante = 0;
        int cuartoCuadrante = 0;

        for (int i = 1; i <= cantidadPuntos; i++) {
            System.out.println("\nIngrese las coordenadas (x, y) del punto " + i + ":");
            System.out.print("Coordenada x: ");
            double x = scanner.nextDouble();
            System.out.print("Coordenada y: ");
            double y = scanner.nextDouble();

            if (x > 0 && y > 0) {
                primerCuadrante++;
            } else if (x < 0 && y > 0) {
                segundoCuadrante++;
            } else if (x < 0 && y < 0) {
                tercerCuadrante++;
            } else if (x > 0 && y < 0) {
                cuartoCuadrante++;
            }
        }

        System.out.println("\nPuntos en el primer cuadrante: " + primerCuadrante);
        System.out.println("Puntos en el segundo cuadrante: " + segundoCuadrante);
        System.out.println("Puntos en el tercer cuadrante: " + tercerCuadrante);
        System.out.println("Puntos en el cuarto cuadrante: " + cuartoCuadrante);

        scanner.close();
    }
}