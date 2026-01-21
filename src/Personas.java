public class Personas {
    private String dni;
    private String nombre;
    private int edad;

    public Personas() {
    }
    public Personas(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String toString() {
        return String.format("Mi nombre es: %s, mi edad es: %d y mi dni es: %s", nombre, edad, dni);
    }
}

