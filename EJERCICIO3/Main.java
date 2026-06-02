import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Operacion op = new Operacion();

        int opcion;

        do {
            System.out.println("\n===== MENU DE OPERACIONES =====");
            System.out.println("1. Sumar dos enteros");
            System.out.println("2. Sumar dos decimales");
            System.out.println("3. Sumar tres enteros");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el primer entero: ");
                    int a = teclado.nextInt();

                    System.out.print("Ingrese el segundo entero: ");
                    int b = teclado.nextInt();

                    System.out.println("Resultado: " + op.sumar(a, b));
                    break;

                case 2:
                    System.out.print("Ingrese el primer decimal: ");
                    double x = teclado.nextDouble();

                    System.out.print("Ingrese el segundo decimal: ");
                    double y = teclado.nextDouble();

                    System.out.println("Resultado: " + op.sumar(x, y));
                    break;

                case 3:
                    System.out.print("Ingrese el primer entero: ");
                    int n1 = teclado.nextInt();

                    System.out.print("Ingrese el segundo entero: ");
                    int n2 = teclado.nextInt();

                    System.out.print("Ingrese el tercer entero: ");
                    int n3 = teclado.nextInt();

                    System.out.println("Resultado: " + op.sumar(n1, n2, n3));
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        teclado.close();
    }
}
