package ejercicio5;

import java.util.ArrayList;

public class GestorEstudiantes {

    private ArrayList<Estudiante> estudiantes;

    public GestorEstudiantes() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre) {
        Estudiante estudiante = new Estudiante(nombre);
        estudiantes.add(estudiante);
        System.out.println(" Estudiante \"" + estudiante.getNombre() + "\" agregado correctamente.");
    }

    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        System.out.println("\n--- Lista de Estudiantes (" + estudiantes.size() + ") ---");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
    }

    public int getCantidad() {
        return estudiantes.size();
    }
}
