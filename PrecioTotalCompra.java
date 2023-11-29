// Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador. 

import java.util.Scanner;

public class PrecioTotalCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del artículo:");
        double precioArticulo = scanner.nextDouble();

        System.out.println("Ingrese la cantidad que lleva el cliente:");
        int cantidad = scanner.nextInt();

        double totalPagar = precioArticulo * cantidad;

        System.out.println("El total a abonar es: " + totalPagar);

        scanner.close();
    }
}