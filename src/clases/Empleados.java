package clases;

public class Empleados extends Personas {
    protected double salarioBase;
    protected int antiguedadAnios;


    public Empleados(String dni, String nombre, int edad, double salarioBase, int antiguedadAnios) {
        super(dni, nombre, edad);
        this.salarioBase = salarioBase;
        this.antiguedadAnios = antiguedadAnios;
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

    public double calcularSalario(double salarioBase, int antiguedadAnios) {

        return salarioBase*antiguedadAnios;
    }


    @Override
    public String toString() {
        return String.format("Empleado:%n Nombre: %s, DNI: %s, Edad: %d, Salario base: %.2f, Años de antiguedad: %d", super.getNombre(), super.getDni(), super.getEdad(), this.salarioBase, this.antiguedadAnios);
    }
}
