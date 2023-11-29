// Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo. En el constructor cargar los atributos y luego en otro método imprimir sus datos y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000) 

public class Empleado1 {
    private String nombre;
    private double sueldo;

    public Empleado1(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void imprimirDatosEmpleado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: $" + sueldo);
    }

    public void verificarImpuestos() {
        if (sueldo > 3000) {
            System.out.println("El empleado " + nombre + " debe pagar impuestos.");
        } else {
            System.out.println("El empleado " + nombre + " no debe pagar impuestos.");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
}