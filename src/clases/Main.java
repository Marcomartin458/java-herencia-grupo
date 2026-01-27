package clases;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Persona> personas = new ArrayList<>();


    public static void main(String[] args) {
        informacionPersonas();

    }

    public static void informacionPersonas() {
        if (!personas.isEmpty()) {
            for (Persona persona : personas) {
                if (persona instanceof Empleado e) {
                    double salario = e.calcularSalario(e.getSalarioBase(), e.getAntiguedadAnios());
                    System.out.println(persona + " y el salario total percibido es: " + salario);
                }
            }
        } else {
            System.out.println("No hay personas");
        }
    }
}
