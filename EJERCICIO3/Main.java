public class Main {

    public static void main(String[] args) {

        Operacion op = new Operacion();

        int resultado1 = op.sumar(10, 20);
        double resultado2 = op.sumar(5.5, 4.5);
        int resultado3 = op.sumar(10, 20, 30);

        System.out.println("Suma de dos enteros: " + resultado1);
        System.out.println("Suma de dos decimales: " + resultado2);
        System.out.println("Suma de tres enteros: " + resultado3);
    }
}
