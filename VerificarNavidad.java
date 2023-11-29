// Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad. 

import java.util.Scanner;

public class VerificarNavidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha (en formato dd-mm):");
        String fecha = scanner.nextLine();

        if (fecha.equals("25-12")) {
            System.out.println("¡La fecha ingresada corresponde a Navidad!");
        } else {
            System.out.println("La fecha ingresada no corresponde a Navidad.");
        }

        scanner.close();
    }
}