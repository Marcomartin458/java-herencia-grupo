import java.util.ArrayList;

public class Main {
    private static ArrayList<Personas> personas = new ArrayList<>();


    public static void main(String[] args) {
        informacionPersonas();

    }

    public static void informacionPersonas() {

       personas.add(new Empleados("5678909H", "Aitor", 26, 12000, 3));

        if (!personas.isEmpty()) {
            for (Personas persona : personas) {
                Empleados e = (Empleados) persona;
                double salario = e.calcularSalario(((Empleados) persona).getSalarioBase(), ((Empleados) persona).getAntiguedadAnios());
                System.out.println(persona + " y el salario total percibido es: " + salario);
            }
        }else {
            System.out.println("No hay personas");
        }
    }
}
