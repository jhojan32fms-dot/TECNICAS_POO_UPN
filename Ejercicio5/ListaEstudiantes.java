package ejercicio5;

import java.util.Scanner;

public class ListaEstudiantes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorEstudiantes gestor = new GestorEstudiantes();
        int opcion = 0;

        while (opcion != 3) {

            System.out.println("\n=== LISTA DE ESTUDIANTES ===");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine().trim());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese nombre del estudiante: ");
                        String nombre = sc.nextLine();
                        try {
                            gestor.agregarEstudiante(nombre);
                        } catch (IllegalArgumentException e) {
                            System.out.println(" Error al agregar: " + e.getMessage());
                        }
                        break;

                    case 2:
                        gestor.mostrarEstudiantes();
                        break;

                    case 3:
                        System.out.println("Programa finalizado. Total de estudiantes: " + gestor.getCantidad());
                        break;

                    default:
                        System.out.println(" Opción inválida. Ingrese 1, 2 o 3. 5");
                }

            } catch (NumberFormatException e) {
                System.out.println(" Error: debe ingresar un número entero válido.");
            }
        }

        sc.close();
    }
}
