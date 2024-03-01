package Ejercicio2;
import java.util.*;

public class SistemaGestionPedidosPizza {
    public static void main(String[] args) {

        User user = new User();
        user.crearUsuario();
        Scanner sc = new Scanner(System.in);

        while (true) {

            int opcion = 0;
            System.out.println("1. Crear pedido");
            System.out.println("2. Eliminar pedido");
            System.out.println("3. Modificar pedido");
            System.out.println("4. Mostrar pedidos");
            System.out.println("5. Salir");

            System.out.println("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    OrderManager order = new OrderManager("", user);
                    System.out.println("Introduce la id del pedido: ");
                    String id = sc.next();
                    break;
                case 2:
                    OrderManager order2 = new OrderManager();
                    order2.removeOrder();
                    break;
                case 3:
                    OrderManager order3 = new OrderManager();
                    order3.updateOrder();
                    break;
                case 4:
                    OrderManager order4 = new OrderManager();
                    order4.showOrders();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }


        }



    }


}
