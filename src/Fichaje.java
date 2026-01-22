import java.time.LocalDate;

public class Fichaje  extends Empleados{
    private String idFichaje;
    private LocalDate fechaHoraEntrada;
    private LocalDate fechaHoraSalida;
    private String tipo;

    public Fichaje(String dni, String nombre, int edad, LocalDate fechaNacimiento, String email, String telefono, double salarioBase, int antiguedadAnios, String idEmpleado, String idFichaje, LocalDate fechaHoraEntrada, LocalDate fechaHoraSalida, String tipo) {
        super(dni, nombre, edad, fechaNacimiento, email, telefono, salarioBase, antiguedadAnios, idEmpleado);
        this.idFichaje = idFichaje;
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.fechaHoraSalida = fechaHoraSalida;
        this.tipo = tipo;
    }

    public String getIdFichaje() {
        return idFichaje;
    }

    public void setIdFichaje(String idFichaje) {
        this.idFichaje = idFichaje;
    }

    public LocalDate getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public void setFechaHoraEntrada(LocalDate fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public LocalDate getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDate fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj ) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Empleados empleado = (Empleados) obj;

        return this.idEmpleado != null ? this.idEmpleado.equals(empleado.getIdEmpleado()) : empleado.getIdEmpleado() == null;
    }

    @Override
    public int hashCode() {
        return idEmpleado != null ? idEmpleado.hashCode() : 0;
    }
}
