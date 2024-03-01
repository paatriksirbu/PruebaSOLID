package Ejercicio2;
import Ejercicio2.Pizzas.*;

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
                    System.out.println("Introduce la id del pedido: ");
                    int id = sc.nextInt();
                    OrderManager pedido1 = new OrderManager(id, user);
                    System.out.println("Elige una pizza: PizzaAmatriciana, PizzaDiavola, PizzaCarbonara, PizzaBarbacoa, PizzaSerrana, PizzaTonno, PizzaMargarita");
                    String pizzaElegida = sc.next();
                    Pizza pizza = null;

                    switch (pizzaElegida){
                        case "PizzaAmatriciana":
                            pizza = new PizzaAmatriciana();
                            break;
                        case "PizzaDiavola":
                            pizza = new PizzaDiavola();
                            break;
                        case "PizzaCarbonara":
                            pizza = new PizzaCarbonara();
                            break;
                        case "PizzaBarbacoa":
                            pizza = new PizzaBarbacoa();
                            break;
                        case "PizzaSerrana":
                            pizza = new PizzaSerrana();
                            break;
                        case "PizzaTonno":
                            pizza = new PizzaTonno();
                            break;
                        case "PizzaMargarita":
                            pizza = new PizzaMargarita();
                            break;
                        default:
                            System.out.println("Pizza no válida");
                            break;
                    }
                    if (pizza == null){
                        System.out.println("No se ha añadido la pizza");
                    }

                    pedido1.addPizza(pizza);
                    System.out.println("Has elegido la pizza: " + pizza.getNombre());
                    System.out.println("Los toppings son: ");
                    pizza.showToppings();
                    System.out.println("\n");
                    System.out.println("Pedido añadido");
                    pedido1.addOrder(id);

                    System.out.println("Quieres añadir otra pizza? (s/n)");
                    String respuesta = sc.next();

                    while (respuesta.equals("s")){
                        System.out.println("Elige una pizza: PizzaAmatriciana, PizzaDiavola, PizzaCarbonara, PizzaBarbacoa, PizzaSerrana, PizzaTonno, PizzaMargarita");
                        pizzaElegida = sc.next();
                        pizza = null;

                        switch (pizzaElegida){
                            case "PizzaAmatriciana":
                                pizza = new PizzaAmatriciana();
                                break;
                            case "PizzaDiavola":
                                pizza = new PizzaDiavola();
                                break;
                            case "PizzaCarbonara":
                                pizza = new PizzaCarbonara();
                                break;
                            case "PizzaBarbacoa":
                                pizza = new PizzaBarbacoa();
                                break;
                            case "PizzaSerrana":
                                pizza = new PizzaSerrana();
                                break;
                            case "PizzaTonno":
                                pizza = new PizzaTonno();
                                break;
                            case "PizzaMargarita":
                                pizza = new PizzaMargarita();
                                break;
                            default:
                                System.out.println("Pizza no válida");
                                break;
                        }
                        if (pizza == null){
                            System.out.println("No se ha añadido la pizza");
                        }

                        pedido1.addPizza(pizza);
                        System.out.println("Has elegido la pizza: " + pizza.getNombre() + "\n");
                        pizza.showToppings();
                        System.out.println("\n");
                        System.out.println("Pedido añadido");
                        pedido1.addOrder(id);

                        System.out.println("Quieres añadir otra pizza? (s/n)");
                        respuesta = sc.next();
                    }





                    break;
               /* case 2:
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

                */
                default:
                    System.out.println("Opción no válida");
                    break;
            }


        }



    }


}
