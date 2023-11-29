// Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc. 

public class MultiplosDeOcho {
    public static void main(String[] args) {
        int limite = 500;
        int multiplo = 8;

        for (int i = multiplo; i <= limite; i += multiplo) {
            System.out.print(i + " ");
        }
    }
}