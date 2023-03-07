package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        ManejadorPrestamo.getInstance().setCantidadOriginal(100);

        EquipoPrestamos equipoDePrestamos = new EquipoPrestamos();

        equipoDePrestamos.criteriaHandler(25);
        equipoDePrestamos.criteriaHandler(25);
        equipoDePrestamos.criteriaHandler(25);
        equipoDePrestamos.criteriaHandler(25);


    }
    }

