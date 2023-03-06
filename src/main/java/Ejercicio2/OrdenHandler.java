package Ejercicio2;

public interface OrdenHandler {
    void setNextHandler(OrdenHandler handler);
    void handlePedido(String pedido);
}
