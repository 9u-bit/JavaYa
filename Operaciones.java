// Implementar la clase operaciones. Se deben cargar dos valores enteros, calcular su suma, resta, multiplicaci�n y divisi�n, cada una en un m�todo, imprimir dichos resultados. 

import java.util.Scanner;

public class Operaciones {
    private int valor1;
    private int valor2;

    public void cargarValores() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor entero: ");
        valor1 = scanner.nextInt();

        System.out.print("Ingrese el segundo valor entero: ");
        valor2 = scanner.nextInt();
    }

    public int calcularSuma() {
        return valor1 + valor2;
    }

    public int calcularResta() {
        return valor1 - valor2;
    }

    public int calcularMultiplicacion() {
        return valor1 * valor2;
    }

    public double calcularDivision() {
        if (valor2 != 0) {
            return (double) valor1 / valor2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        operaciones.cargarValores();

        System.out.println("Suma: " + operaciones.calcularSuma());
        System.out.println("Resta: " + operaciones.calcularResta());
        System.out.println("Multiplicaci�n: " + operaciones.calcularMultiplicacion());
        System.out.println("Divisi�n: " + operaciones.calcularDivision());
    }
}