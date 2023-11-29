// Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad de habitantes del mismo. Ordenar alfabéticamente e imprimir los resultados. Por último ordenar con respecto a la cantidad de habitantes (de mayor a menor) e imprimir nuevamente. 

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarPaisesHabitantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] paises = new String[5];
        int[] habitantes = new int[5];

        System.out.println("Ingrese los nombres de 5 países y su cantidad de habitantes:");

        for (int i = 0; i < 5; i++) {
            System.out.print("País " + (i + 1) + ": ");
            paises[i] = scanner.nextLine();

            System.out.print("Cantidad de habitantes del país " + paises[i] + ": ");
            habitantes[i] = scanner.nextInt();
            scanner.nextLine();
        }

        Arrays.sort(paises);

        System.out.println("\nPaíses ordenados alfabéticamente:");
        for (String pais : paises) {
            System.out.println(pais);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (habitantes[j] < habitantes[j + 1]) {
                    int tempHab = habitantes[j];
                    habitantes[j] = habitantes[j + 1];
                    habitantes[j + 1] = tempHab;

                    String tempPais = paises[j];
                    paises[j] = paises[j + 1];
                    paises[j + 1] = tempPais;
                }
            }
        }

        System.out.println("\nPaíses ordenados por cantidad de habitantes (de mayor a menor):");
        for (int i = 0; i < 5; i++) {
            System.out.println(paises[i] + " - Habitantes: " + habitantes[i]);
        }

        scanner.close();
    }
}