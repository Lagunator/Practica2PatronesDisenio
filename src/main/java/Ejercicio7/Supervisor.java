package Ejercicio7;

public class Supervisor implements IAgentePago{

    private IAgentePago next;

    @Override
    public void setNext(IAgentePago agentePago) {

        next = agentePago;

    }

    @Override
    public void criteriaHandler(int cantidad) {

        if(ManejadorPrestamo.getInstance().getCantidadPagada() < ManejadorPrestamo.getInstance().getCantidadOriginal()) {

            ManejadorPrestamo.getInstance().setCantidadPagada(ManejadorPrestamo.getInstance().getCantidadPagada() + cantidad);
            System.out.println("Supervisor: Pago realizado, Desea hacer otro prestamo?");

            if(ManejadorPrestamo.getInstance().getCantidadPagada() >= ManejadorPrestamo.getInstance().getCantidadOriginal()) {

                System.out.println("Supervisor: Su pago se realizo! Lo enviaremos con el Encargado de Prestamos");

                next.criteriaHandler(cantidad);

            }

        } else {

            next.criteriaHandler(cantidad);

        }

    }

    @Override
    public IAgentePago next() {
        return null;
    }
}
