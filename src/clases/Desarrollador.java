package clases;

import java.time.LocalDate;

public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador(String dni, String nombre, int edad, LocalDate fechaNacimiento, String email, String telefono, double salarioBase, int antiguedadAnios, String idEmpleado, String lenguajePrincipal) {
        super(dni, nombre, edad, fechaNacimiento, email, telefono, salarioBase, antiguedadAnios, idEmpleado);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public String toString() {
        return String.format("Desarrollador: %nDNI: %s Nombre: %s Edad: %d Salario base: %.2f Años de antiguedad: %d Lenguaje principal: %s", super.getDni(), super.getNombre(), super.getEdad(),
                super.getSalarioBase(), super.getAntiguedadAnios(), this.lenguajePrincipal);
    }

    @Override
    public double calcularSalario(double salarioBase, int antiguedadAnios) {
        return super.calcularSalario(salarioBase, antiguedadAnios);
    }
}
