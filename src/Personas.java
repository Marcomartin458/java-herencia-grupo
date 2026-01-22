import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Personas {
    private String dni;
    protected String nombre;
    protected int edad;
    private LocalDate fechaNacimiento;
    private String email;
    private String telefono;


    public Personas() {
    }

    public Personas(String dni, String nombre, int edad, LocalDate fechaNacimiento, String email, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
    }
    public static int calcularEdad(LocalDate fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        String fechaNacimientoFormateada = formatter.format(fechaNacimiento);
        String fechaActual = formatter.format(LocalDate.now());
        int fechaActualInt = Integer.parseInt(fechaActual);
        int fechaNacimientoInt = Integer.parseInt(fechaNacimientoFormateada);

        return  fechaActualInt - fechaNacimientoInt;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String fecha_formateada = fechaNacimiento.format(formatter);
        return String.format("Mi nombre es: %s, mi edad es: %d y mi dni es: %s. Nací en. %s", nombre, edad, dni, fecha_formateada);
    }
}

