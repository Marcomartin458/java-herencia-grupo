import java.util.ArrayList;

public class Main {
    private static ArrayList<Personas> personas = new ArrayList<>();


    public static void main(String[] args) {
        informacionPersonas();

    }

    public static void informacionPersonas() {
        if (!personas.isEmpty()) {
            for (Personas persona : personas) {
                if (persona instanceof Empleados e) {
                    double salario = e.calcularSalario(e.getSalarioBase(), e.getAntiguedadAnios());
                    System.out.println(persona + " y el salario total percibido es: " + salario);
                }
            }
        } else {
            System.out.println("No hay personas");
        }
    }
}
