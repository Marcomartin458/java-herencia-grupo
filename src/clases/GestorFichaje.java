package clases;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

public class GestorFichaje {
    private static Map<Empleado, Fichaje> fichajes = new LinkedHashMap();
    private static Fichaje fichaje;

    public static void registrarEntrada(Empleado empleado) {
        LocalDateTime fechaHoraEntrada = LocalDateTime.now();
        fichaje.setFechaHoraEntrada(fechaHoraEntrada);
        fichajes.put(empleado, );
    }

    public static void registrarSalida(Empleado empleado) {

    }

    public static void obtenerFichajesDIa(Empleado empleado) {

    }

    public static void calcularHorasMenssuales(Empleado empleado) {

    }

    public static void generarReporteAsistencia(Empleado empleado) {

    }
}
