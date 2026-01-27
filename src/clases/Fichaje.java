package clases;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Fichaje  extends Empleado {
    private String idFichaje;
    private LocalDateTime fechaHoraEntrada;
    private LocalDateTime fechaHoraSalida;
    private String tipo;

    public Fichaje(String dni, String nombre, int edad, LocalDate fechaNacimiento, String email, String telefono, double salarioBase, int antiguedadAnios, String idEmpleado, LocalDateTime fechaHoraEntrada, String tipo, LocalDateTime fechaHoraSalida, String idFichaje) {
        super(dni, nombre, edad, fechaNacimiento, email, telefono, salarioBase, antiguedadAnios, idEmpleado);
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.tipo = tipo;
        this.fechaHoraSalida = fechaHoraSalida;
        this.idFichaje = idFichaje;
    }

    public String getIdFichaje() {
        return idFichaje;
    }

    public void setIdFichaje(String idFichaje) {
        this.idFichaje = idFichaje;
    }

    public LocalDateTime getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public void setFechaHoraEntrada(LocalDateTime fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
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

        Empleado empleado = (Empleado) obj;

        return this.idEmpleado != null ? this.idEmpleado.equals(empleado.getIdEmpleado()) : empleado.getIdEmpleado() == null;
    }

    @Override
    public int hashCode() {
        return idEmpleado != null ? idEmpleado.hashCode() : 0;
    }
}
