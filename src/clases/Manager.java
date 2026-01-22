package clases;

public class Manager extends Empleados{
    protected int personasACargo;

    public Manager(String dni, String nombre, int edad, double salarioBase, int antiguedadAnios, int personasACargo) {
        super(dni, nombre, edad, salarioBase, antiguedadAnios);
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
        return String.format("clases.Manager: %nDNI: %s Nombre: %s Edad: %d Salario base: %.2f Años de antiguedad: %d clases.Personas a cargo: %d", super.getDni(), super.getNombre(), super.getEdad(),
                super.getSalarioBase(), super.getAntiguedadAnios(), this.personasACargo);
    }

    @Override
    public double calcularSalario(double salarioBase, int antiguedadAnios) {
        return super.calcularSalario(salarioBase, antiguedadAnios);
    }
}
