package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado extends Persona {
    protected double salarioBase;
    protected int antiguedadAnios=calcularAntiguedad(getFechaContratacion());
    protected String idEmpleado;
    protected LocalDate fechaContratacion;
    protected String departamento;
    protected double jornadaHoraria;
    protected boolean activo;


    public Empleado(String dni, String nombre, int edad, LocalDate fechaNacimiento, String email, String telefono, double salarioBase, int antiguedadAnios, String idEmpleado, LocalDate fechaContratacion, String departamento, double jornadaHoraria, boolean activo) {
        super(dni, nombre, edad, fechaNacimiento, email, telefono);
        this.salarioBase = salarioBase;
        this.antiguedadAnios = antiguedadAnios;
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.departamento = departamento;
        this.jornadaHoraria = jornadaHoraria;
        this.activo = activo;
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

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getJornadaHoraria() {
        return jornadaHoraria;
    }

    public void setJornadaHoraria(double jornadaHoraria) {
        this.jornadaHoraria = jornadaHoraria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public int calcularAntiguedad(LocalDate fechaContratacion) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        String fechaContratacionFormateada = formatter.format(fechaContratacion);
        String fechaActual = formatter.format(LocalDate.now());
        int fechaActualInt = Integer.parseInt(fechaActual);
        int fechaContratacionInt = Integer.parseInt(fechaContratacionFormateada);

        antiguedadAnios=fechaActualInt - fechaContratacionInt;

        return antiguedadAnios;
    }

    public double calcularSalario(double salarioBase, int antiguedadAnios) {

        return salarioBase*(antiguedadAnios*0.03);
    }

// Metodo presentarse añadido como metodo toString.
    @Override
    public String toString() {
        return String.format("Empleado: %s%n Nombre: %s, DNI: %s, Edad: %d, Salario base: %.2f, Años de antiguedad: %d. Departamento: %s. Jornada: %.2f. Activo: %s ", getIdEmpleado(), super.getNombre(), super.getDni(), super.getEdad(), this.salarioBase, this.antiguedadAnios, this.departamento, this.jornadaHoraria, this.activo);
    }
}
