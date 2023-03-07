package Ejercicio7;

public class ManejadorPrestamo {
    private static ManejadorPrestamo instance;

    private int cantidadOriginal = 0;

    private int cantidadPagada = 0;

    private ManejadorPrestamo() {}

    public static ManejadorPrestamo getInstance() {

        if(instance == null) {

            instance = new ManejadorPrestamo();

        }

        return instance;

    }

    public int getCantidadOriginal() {
        return cantidadOriginal;
    }

    public void setCantidadOriginal(int cantidadOriginal) {
        this.cantidadOriginal = cantidadOriginal;
    }

    public int getCantidadPagada() {
        return cantidadPagada;
    }

    public void setCantidadPagada(int cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }

    public void pagar(int cantidad) {

        cantidadPagada +=cantidad;

    }
}
