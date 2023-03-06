package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        General general = new General();
        Teniente teniente = new Teniente();
        Coronel coronel = new Coronel();
        Cabo cabo = new Cabo();

        general.setNextHandler(teniente);
        teniente.setNextHandler(coronel);
        coronel.setNextHandler(cabo);

        general.handlePedido("Entrevistas");
        general.handlePedido("Disciplina");
        general.handlePedido("Desbloqueos/Manifestaciones");
        general.handlePedido("Limpiezas");
    }
}

