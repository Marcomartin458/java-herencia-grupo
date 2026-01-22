package clases;

import java.time.LocalDate;

public class Manager extends Empleados{
    protected int personasACargo;

    public Manager(String dni, String nombre, int edad, LocalDate fechaNacimiento, String email, String telefono, double salarioBase, int antiguedadAnios, String idEmpleado, int personasACargo) {
        super(dni, nombre, edad, fechaNacimiento, email, telefono, salarioBase, antiguedadAnios, idEmpleado);
        this.personasACargo = personasACargo;
    }

    public int getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(int personasACargo) {
        this.personasACargo = personasACargo;
    }

    @Override
    public String toString() {
        return String.format("Manager: %nDNI: %s Nombre: %s Edad: %d Salario base: %.2f Años de antiguedad: %d Personas a cargo: %d", super.getDni(), super.getNombre(), super.getEdad(),
                super.getSalarioBase(), super.getAntiguedadAnios(), this.personasACargo);
    }

    @Override
    public double calcularSalario(double salarioBase, int antiguedadAnios) {
        return super.calcularSalario(salarioBase, antiguedadAnios);
    }
}
