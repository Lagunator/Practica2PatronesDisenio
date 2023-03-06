package Ejercicio2;

public class Teniente implements OrdenHandler {
    private OrdenHandler nextHandler;

    @Override
    public void setNextHandler(OrdenHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handlePedido(String pedido) {
        if (pedido.equalsIgnoreCase("Disciplina")) {
            System.out.println("El Teniente maneja el pedido de Disciplina.");
        } else if (nextHandler != null) {
            nextHandler.handlePedido(pedido);
        } else {
            System.out.println("No se puede manejar el pedido.");
        }
    }
}

