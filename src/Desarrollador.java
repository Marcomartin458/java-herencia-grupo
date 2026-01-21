public class Desarrollador extends Personas {
    private String lenguajePrincipal;


    public Desarrollador(String dni, String nombre, int edad, String lenguajePrincipal) {
        super(dni, nombre, edad);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

}
