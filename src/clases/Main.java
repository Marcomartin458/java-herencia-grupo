package clases;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Personas> personas = new ArrayList<>();


    public static void main(String[] args) {
        informacionPersonas();

    }

    public static void informacionPersonas() {

        personas.add(new Desarrollador("23454547H", "Juan", 25, 15000, 4, "Java"));
        personas.add(new Manager("5678945H", "Manuel", 31, 20000, 17, 35));
        personas.add(new Empleados("5678909H", "Aitor", 26, 12000, 3));

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
