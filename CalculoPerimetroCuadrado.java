// Realizar la carga del lado de un cuadrado, mostrar por pantalla el per�metro del mismo (El per�metro de un cuadrado se calcula multiplicando el valor del lado por cuatro) 

import java.util.Scanner;

public class CalculoPerimetroCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del cuadrado: ");
        
        double lado = scanner.nextDouble();

        double perimetro = lado * 4;

        System.out.println("El per�metro del cuadrado es: " + perimetro);

        scanner.close();
    }
}