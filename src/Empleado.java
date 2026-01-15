import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class Empleado extends Personas {
    private double salarioBase;
    private int antiguedadAnios;

    public Empleado(String nombre, String dni, int edad) {
        super(nombre, dni, edad);

    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAntiguedadAnios() {
        return antiguedadAnios;
    }

    public void setAntiguedadAnios(int antiguedadAnios) {
        this.antiguedadAnios = antiguedadAnios;
    }

    @Override
    public String toString() {
        return String.format("Empleado: %s, %d, %d, %d, %d", super.getNombre(), super.getdni(), super.getEdad(), this.salarioBase, this.antiguedadAnios);
    }
}
