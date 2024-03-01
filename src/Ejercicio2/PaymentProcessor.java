package Ejercicio2;

public class PaymentProcessor {

    private DataBaseManager dataBaseManager;
    private OrderManager orderManager;

    private int idPago;
    private int idPedido;
    private double importePedido;

    //Metodos para pagos. Se simulan los pagos
    public void realizarPago() {
        System.out.println("Realizando pago...");
        System.out.println("Pago realizado correctamente");
        dataBaseManager.updateOrderStatus(orderManager, "Pagado");
    }

    public void cancelarPago() {
        System.out.println("Cancelando pago");
        System.out.println("Pago cancelado correctamente");
        dataBaseManager.updateOrderStatus(orderManager, "Cancelado");
    }

    public void reembolsarPago() {
        System.out.println("Reembolsando pago");
        System.out.println("Pago reembolsado correctamente");
        dataBaseManager.updateOrderStatus(orderManager, "Reembolsado");
    }
}

