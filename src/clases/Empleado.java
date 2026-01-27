package clases;

import java.time.LocalDate;

public class Empleado extends Persona {
    protected double salarioBase;
    protected int antiguedadAnios;
    protected String idEmpleado;



    public Empleado(String dni, String nombre, int edad, LocalDate fechaNacimiento, String email, String telefono, double salarioBase, int antiguedadAnios, String idEmpleado) {
        super(dni, nombre, edad, fechaNacimiento, email, telefono);
        this.salarioBase = salarioBase;
        this.antiguedadAnios = antiguedadAnios;
        this.idEmpleado = idEmpleado;
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

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double calcularSalario(double salarioBase, int antiguedadAnios) {

        return salarioBase*(antiguedadAnios*0.03);
    }

// Metodo presentarse añadido como metodo toString.
    @Override
    public String toString() {
        return String.format("Empleado: %s%n Nombre: %s, DNI: %s, Edad: %d, Salario base: %.2f, Años de antiguedad: %d", getIdEmpleado(), super.getNombre(), super.getDni(), super.getEdad(), this.salarioBase, this.antiguedadAnios);
    }
}
