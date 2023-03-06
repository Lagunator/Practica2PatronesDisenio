package Ejercicio2;

public class General implements OrdenHandler {
    private OrdenHandler nextHandler;

    @Override
    public void setNextHandler(OrdenHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handlePedido(String pedido) {
        if (pedido.equalsIgnoreCase("Entrevistas")) {
            System.out.println("El General maneja el pedido de Entrevistas.");
        } else if (nextHandler != null) {
            nextHandler.handlePedido(pedido);
        } else {
            System.out.println("No se puede manejar el pedido.");
        }
    }
}

