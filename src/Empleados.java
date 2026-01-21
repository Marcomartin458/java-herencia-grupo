public class Empleados extends Personas {
    private double salarioBase;
    private int antiguedadAnios;



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

    @Override
    public String toString() {
        return String.format("Empleado: %s, %s, %d, %.2f, %d", super.getNombre(), super.getDni(), super.getEdad(), this.salarioBase, this.antiguedadAnios);
    }
}
