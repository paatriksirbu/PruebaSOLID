package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Matriz m = new Matriz(new int[][]{{1,2},{3, 4}});
        System.out.println("Matriz original");
        m.imprimir();

        Matriz t = m.transpuesta();
        System.out.println("Matriz transpuesta");
        t.imprimir();
    }
}
