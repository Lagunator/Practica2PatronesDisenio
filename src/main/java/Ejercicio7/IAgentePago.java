package Ejercicio7;

public interface IAgentePago {
    void setNext(IAgentePago agentePago);
    void criteriaHandler(int cantidad);
    IAgentePago next();
}
