// Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo. Confeccionar los métodos para la carga, otro para imprimir sus datos y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000) 

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private double sueldo;

    public void cargarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el sueldo del empleado: ");
        sueldo = scanner.nextDouble();
    }

    public void imprimirDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Sueldo del empleado: " + sueldo);
    }

    public void pagarImpuestos() {
        if (sueldo > 3000) {
            System.out.println("El empleado " + nombre + " debe pagar impuestos.");
        } else {
            System.out.println("El empleado " + nombre + " no debe pagar impuestos.");
        }
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        empleado.cargarDatos();
        empleado.imprimirDatos();
        empleado.pagarImpuestos();
    }
}