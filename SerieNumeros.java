// Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado) 

public class SerieNumeros {
    public static void main(String[] args) {
        int cantidadTerminos = 25;
        int numero = 11;

        for (int i = 1; i <= cantidadTerminos; i++) {
            System.out.print(numero + " ");

            numero += 11;
        }
    }
}