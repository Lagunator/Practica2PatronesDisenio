package Ejercicio2;

public class Cabo implements OrdenHandler {
    private OrdenHandler nextHandler;

    @Override
    public void setNextHandler(OrdenHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handlePedido(String pedido) {
        if (pedido.equalsIgnoreCase("Limpiezas")) {
            System.out.println("El Cabo maneja el pedido de Limpiezas.");
        } else if (nextHandler != null) {
            nextHandler.handlePedido(pedido);
        } else {
            System.out.println("No se puede manejar el pedido.");
        }
    }
}

