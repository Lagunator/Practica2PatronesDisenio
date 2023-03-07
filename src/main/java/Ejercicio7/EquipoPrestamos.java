package Ejercicio7;

public class EquipoPrestamos implements IAgentePago{

    private IAgentePago next;

    @Override
    public void setNext(IAgentePago agentePago) {

        next = agentePago;

    }

    @Override
    public void criteriaHandler(int cantidad) {

        Cajero cajero = new Cajero();
        this.setNext(cajero);
        AgenteDeCredito agenteDeCredito = new AgenteDeCredito();
        cajero.setNext(agenteDeCredito);
        Supervisor supervisor = new Supervisor();
        agenteDeCredito.setNext(supervisor);
        EncargadoPrestamos encargadoPrestamos = new EncargadoPrestamos();
        supervisor.setNext(encargadoPrestamos);

        this.next.criteriaHandler(cantidad);

    }

    @Override
    public IAgentePago next() {
        return null;
    }
}
