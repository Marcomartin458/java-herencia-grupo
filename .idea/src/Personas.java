public class Personas {
    private String dni;
    private String nombre;
    private int edad;

    public Personas(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Personas() {
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

    public void presentarse() {
        System.out.println("Hola, soy " + this.nombre + ", mi dni es: " + this.dni + " y mi edad es: " + this.edad);
    }
}
