package Ejercicio2;

public class Coronel implements OrdenHandler {
    private OrdenHandler nextHandler;

    @Override
    public void setNextHandler(OrdenHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handlePedido(String pedido) {
        if (pedido.equalsIgnoreCase("Desbloqueos/Manifestaciones")) {
            System.out.println("El Coronel maneja el pedido de Desbloqueos/Manifestaciones.");
        } else if (nextHandler != null) {
            nextHandler.handlePedido(pedido);
        } else {
            System.out.println("No se puede manejar el pedido.");
        }
    }
}

