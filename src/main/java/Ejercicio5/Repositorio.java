package Ejercicio5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Repositorio implements IRepositorio {
    private Map<String, Commit> almacenamiento = new LinkedHashMap<>();
    private List<IDesarrollador> desarrolladores = new ArrayList<>();

    public void createCommit(String identificadorCommit, Commit commit) {
        almacenamiento.put(identificadorCommit, commit);
    }

    public Commit getCommit(String identificadorCommit) {
        return almacenamiento.get(identificadorCommit);
    }

    @Override
    public void agregar(IDesarrollador desarrollador) {
        desarrolladores.add(desarrollador);
    }

    @Override
    public void eliminarTodo() {
        desarrolladores.clear();
    }

    @Override
    public void notificacionDesarrolladores(Commit commit) {
        for (IDesarrollador desarrollador : desarrolladores) {
            desarrollador.update("Commit recuperado", commit);
        }
    }
}

