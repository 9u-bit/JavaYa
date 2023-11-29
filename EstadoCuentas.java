// En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
// Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
// a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
// Estado de la cuenta	'Acreedor' si el saldo es >0.
//			'Deudor' si el saldo es <0.
//			'Nulo' si el saldo es =0.
// b) La suma total de los saldos acreedores. 

import java.util.Scanner;

public class EstadoCuentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroCuenta;
        double saldoActual;
        double sumaSaldosAcreedores = 0;

        System.out.println("Ingrese los datos de las cuentas corrientes:");

        do {
            System.out.print("Número de cuenta (ingrese un valor negativo para finalizar): ");
            numeroCuenta = scanner.nextInt();

            if (numeroCuenta >= 0) {
                System.out.print("Saldo actual: ");
                saldoActual = scanner.nextDouble();

                System.out.print("Cuenta número " + numeroCuenta + ": ");
                if (saldoActual > 0) {
                    System.out.println("Acreedor");
                    sumaSaldosAcreedores += saldoActual;
                } else if (saldoActual < 0) {
                    System.out.println("Deudor");
                } else {
                    System.out.println("Nulo");
                }
            }
        } while (numeroCuenta >= 0);

        System.out.println("La suma total de los saldos acreedores es: " + sumaSaldosAcreedores);

        scanner.close();
    }
}