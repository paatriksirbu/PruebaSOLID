package Ejercicio2;
import Ejercicio2.Pizzas.*;

import java.util.*;

public class SistemaGestionPedidosPizza {
    public static void main(String[] args) {

        User user = new User();
        user.crearUsuario();
        Scanner sc = new Scanner(System.in);
        OrderManager pedido1 = null;

        while (true) {

            int opcion = 0;
            System.out.println("1. Crear pedido");
            System.out.println("2. Eliminar pedido");
            System.out.println("3. Modificar pedido");
            System.out.println("4. Mostrar pedidos");
            System.out.println("5. Salir");

            System.out.println("Introduce una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la id del pedido: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    pedido1 = new OrderManager(id, user);
                    System.out.println("Elige una pizza: Pizza Amatriciana, Pizza Diavola, Pizza Carbonara, Pizza Barbacoa, Pizza Serrana, Pizza Tonno, Pizza Margarita");
                    String pizzaElegida = sc.nextLine();
                    Pizza pizza = null;

                    switch (pizzaElegida){
                        case "Pizza Amatriciana":
                            pizza = new PizzaAmatriciana();
                            break;
                        case "Pizza Diavola":
                            pizza = new PizzaDiavola();
                            break;
                        case "Pizza Carbonara":
                            pizza = new PizzaCarbonara();
                            break;
                        case "Pizza Barbacoa":
                            pizza = new PizzaBarbacoa();
                            break;
                        case "Pizza Serrana":
                            pizza = new PizzaSerrana();
                            break;
                        case "Pizza Tonno":
                            pizza = new PizzaTonno();
                            break;
                        case "Pizza Margarita":
                            pizza = new PizzaMargarita();
                            break;
                        default:
                            System.out.println("Pizza no válida");
                            break;
                    }

                    pedido1.addPizza(pizza);
                    if (pizza != null){
                        System.out.println("Has elegido la pizza: " + pizza.getNombre());
                        pizza.showToppings();
                    } else {
                        System.out.println("No se ha añadido la pizza");
                    }


                    System.out.println("\n");
                    System.out.println("Pedido añadido");
                    pedido1.addOrder(id);

                    System.out.println("Quieres añadir otra pizza? (s/n)");
                    String respuesta = sc.nextLine();

                    while (respuesta.equals("s")){
                        System.out.println("Elige una pizza: Pizza Amatriciana, Pizza Diavola, Pizza Carbonara, Pizza Barbacoa, Pizza Serrana, Pizza Tonno, Pizza Margarita");
                        pizzaElegida = sc.nextLine();
                        pizza = null;

                        switch (pizzaElegida){
                            case "Pizza Amatriciana":
                                pizza = new PizzaAmatriciana();
                                break;
                            case "Pizza Diavola":
                                pizza = new PizzaDiavola();
                                break;
                            case "Pizza Carbonara":
                                pizza = new PizzaCarbonara();
                                break;
                            case "Pizza Barbacoa":
                                pizza = new PizzaBarbacoa();
                                break;
                            case "Pizza Serrana":
                                pizza = new PizzaSerrana();
                                break;
                            case "Pizza Tonno":
                                pizza = new PizzaTonno();
                                break;
                            case "Pizza Margarita":
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
                        respuesta = sc.nextLine();
                    }
                    break;
               case 2:

                   System.out.println("Introduce la id del pedido a eliminar: ");
                   int idEliminar = sc.nextInt();
                   sc.nextLine();
                   if (pedido1.getOrders().contains(idEliminar)){
                       pedido1.removeOrder(idEliminar);
                   } else {
                       System.out.println("No se ha encontrado el pedido");
                   }
                   break;
                case 3:
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
