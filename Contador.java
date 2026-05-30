import java.util.Scanner;

public class Contador {

    private static int contador = 0;
    private String nombre;

    public Contador(String nombre) {
        this.nombre = nombre;
        contador++;
    }

    public void mostrarDatos() {
        System.out.println("Persona registrada: " + nombre);
    }

    public static int obtenerContador() {
        return contador;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== REGISTRO DE PERSONAS ===");

        System.out.print("¿Cuántas personas desea registrar?: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        Contador[] personas = new Contador[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            String nombre = teclado.nextLine();

            personas[i] = new Contador(nombre);
        }

        System.out.println("\n=== PERSONAS REGISTRADAS ===");

        for (int i = 0; i < cantidad; i++) {
            personas[i].mostrarDatos();
        }

        System.out.println("\nTotal de objetos creados: " + Contador.obtenerContador());

        teclado.close();
    }
}