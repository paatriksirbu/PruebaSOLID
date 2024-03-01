package Ejercicio2;
import Ejercicio2.Pizzas.*;

import java.util.*;

public class SistemaGestionPedidosPizza {
    public static void main(String[] args) {

        User user = new User();
        user.crearUsuario();    //Pedimos al usuario que introduzca sus datos.
        Scanner sc = new Scanner(System.in);
        OrderManager pedido1 = new OrderManager(0, user); //Creamos un pedido con el usuario que ha introducido sus datos.

        while (true) {
            //Mostramos el menu al usuario.
            int opcion = 0;
            System.out.println("Bienvenido a la Pizzeria Sirbu\n");
            System.out.println("1. Crear pedido");
            System.out.println("2. Eliminar pedido");
            System.out.println("3. Actualizar pedido");
            System.out.println("4. Mostrar pedidos");
            System.out.println("5. Realizar pago");
            System.out.println("6. Salir");

            System.out.println("Introduce una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la id del pedido: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    pedido1.addOrder(id);
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

                    pedido1.addPizzaToOrder(id, pizza);
                    if (pizza != null){
                        System.out.println("Has elegido la pizza: " + pizza.getNombre());
                        pizza.showToppings();
                    } else {
                        System.out.println("No se ha añadido la pizza");
                    }


                    System.out.println("\n");
                    System.out.println("Pedido añadido");

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

                        pedido1.addPizzaToOrder(id, pizza);
                        System.out.println("Has elegido la pizza: " + pizza.getNombre() + "\n");
                        pizza.showToppings();
                        System.out.println("\n");
                        System.out.println("Pedido añadido");

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
                    System.out.println("Introduce la id del pedido a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if(pedido1.getOrders().isEmpty()){
                        System.out.println("No hay pedidos");
                    } else {
                        if (pedido1.getOrders().contains(idActualizar)) {
                            pedido1 = new OrderManager(idActualizar, user);
                            System.out.println("Introduce la nueva id del pedido: ");
                            int nuevaId = sc.nextInt();
                            sc.nextLine();
                            pedido1.updateOrder(idActualizar, nuevaId);

                            System.out.println("1. Añadir pizza");
                            System.out.println("2. Eliminar pizza");
                            System.out.println("Elige una opción: ");
                            int opcionPizza = sc.nextInt();
                            sc.nextLine();
                            switch (opcionPizza) {
                                case 1:
                                    System.out.println("Introduce la id del pedido: ");
                                    id = sc.nextInt();
                                    sc.nextLine();
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

                                    pedido1.addPizzaToOrder(id, pizza);
                                    if (pizza != null){
                                        System.out.println("Has elegido la pizza: " + pizza.getNombre());
                                        pizza.showToppings();
                                    } else {
                                        System.out.println("No se ha añadido la pizza");
                                    }


                                    System.out.println("\n");
                                    System.out.println("Pedido añadido");

                                    System.out.println("Quieres añadir otra pizza? (s/n)");
                                    respuesta = sc.nextLine();

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

                                        pedido1.addPizzaToOrder(id, pizza);
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
                                    System.out.println("Elige una pizza para eliminar: Pizza Amatriciana, Pizza Diavola, Pizza Carbonara, Pizza Barbacoa, Pizza Serrana, Pizza Tonno, Pizza Margarita");
                                    pizzaElegida = sc.nextLine();
                                    // Here you would need to implement a method in your OrderManager class that removes a pizza based on its name
                                    pedido1.removePizzaByName(idActualizar, pizzaElegida);
                                    System.out.println("Pizza eliminada del pedido.");
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                                    break;
                            }


                            System.out.println("Pedido actualizado");
                        } else {
                            System.out.println("No se ha encontrado el pedido");
                        }
                    }

                    break;
                case 4:
                    pedido1.showOrders();
                    break;
                case 5:


                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }


        }



    }


}
