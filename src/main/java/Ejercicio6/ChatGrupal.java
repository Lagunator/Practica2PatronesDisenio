package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class ChatGrupal implements IChat {
    private List<SalaDesarrollo> desarrolladores = new ArrayList<>();

    public ChatGrupal addDesarrolador(SalaDesarrollo desarroladorSala) {
        desarrolladores.add(desarroladorSala);
        return this;
    }

    @Override
    public void send(String msg, Desarrollador desarrollador) {
        SalaDesarrollo salaDesarrollador = (SalaDesarrollo  ) desarrollador;
        for(Desarrollador desarrolladorColega: desarrolladores) {
            if(!desarrolladorColega.getCi().equals(salaDesarrollador.getCi())) {
                desarrolladorColega.received(msg);
            }

        }
    }
}
