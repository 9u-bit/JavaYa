// Implementar la clase operaciones. Se deben cargar dos valores enteros en el constructor, calcular su suma, resta, multiplicación y división, cada una en un método, imprimir dichos resultados. 

public class Operaciones1 {
    private int valor1;
    private int valor2;

    public Operaciones1(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int suma() {
        return valor1 + valor2;
    }

    public int resta() {
        return valor1 - valor2;
    }

    public int multiplicacion() {
        return valor1 * valor2;
    }

    public int division() {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }

    public void imprimirResultados() {
        System.out.println("Suma: " + suma());
        System.out.println("Resta: " + resta());
        System.out.println("Multiplicación: " + multiplicacion());
        System.out.println("División: " + division());
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getValor2() {
        return valor2;
    }
}