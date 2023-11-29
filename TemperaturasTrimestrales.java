// Se desea saber la temperatura media trimestral de cuatro paises. Para ello se tiene como dato las temperaturas medias mensuales de dichos paises.
// Se debe ingresar el nombre del país y seguidamente las tres temperaturas medias mensuales.
// Seleccionar las estructuras de datos adecuadas para el almacenamiento de los datos en memoria.
// a - Cargar por teclado los nombres de los paises y las temperaturas medias mensuales.
// b - Imprimir los nombres de las paises y las temperaturas medias mensuales de las mismas.
// c - Calcular la temperatura media trimestral de cada país.
// c - Imprimr los nombres de los paises y las temperaturas medias trimestrales.
// b - Imprimir el nombre del pais con la temperatura media trimestral mayor. 

import java.util.*;

public class TemperaturasTrimestrales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> temperaturasPaises = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el nombre del país " + (i + 1) + ": ");
            String pais = scanner.nextLine();

            List<Double> temperaturas = new ArrayList<>();
            System.out.println("Ingrese las tres temperaturas medias mensuales para " + pais + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Temperatura mes " + (j + 1) + ": ");
                double temperatura = scanner.nextDouble();
                temperaturas.add(temperatura);
            }
            scanner.nextLine();

            temperaturasPaises.put(pais, temperaturas);
        }

        System.out.println("\nNombres de los países y temperaturas medias mensuales:");
        for (Map.Entry<String, List<Double>> entry : temperaturasPaises.entrySet()) {
            String pais = entry.getKey();
            List<Double> temperaturas = entry.getValue();
            System.out.println(pais + ": " + temperaturas);
        }

        Map<String, Double> temperaturaMediaTrimestral = new HashMap<>();
        for (Map.Entry<String, List<Double>> entry : temperaturasPaises.entrySet()) {
            String pais = entry.getKey();
            List<Double> temperaturas = entry.getValue();
            double mediaTrimestral = calcularMediaTrimestral(temperaturas);
            temperaturaMediaTrimestral.put(pais, mediaTrimestral);
        }

        System.out.println("\nNombres de los países y temperaturas medias trimestrales:");
        for (Map.Entry<String, Double> entry : temperaturaMediaTrimestral.entrySet()) {
            String pais = entry.getKey();
            double mediaTrimestral = entry.getValue();
            System.out.println(pais + ": " + mediaTrimestral);
        }

        String paisMayorMediaTrimestral = encontrarPaisMayorTemperatura(temperaturaMediaTrimestral);
        System.out.println("\nEl país con la temperatura media trimestral mayor es: " + paisMayorMediaTrimestral);

        scanner.close();
    }

    private static double calcularMediaTrimestral(List<Double> temperaturas) {
        double suma = 0;
        for (double temperatura : temperaturas) {
            suma += temperatura;
        }
        return suma / 3;
    }

    private static String encontrarPaisMayorTemperatura(Map<String, Double> temperaturaMediaTrimestral) {
        String paisMayor = "";
        double temperaturaMayor = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : temperaturaMediaTrimestral.entrySet()) {
            String pais = entry.getKey();
            double temperatura = entry.getValue();
            if (temperatura > temperaturaMayor) {
                temperaturaMayor = temperatura;
                paisMayor = pais;
            }
        }
        return paisMayor;
    }
}