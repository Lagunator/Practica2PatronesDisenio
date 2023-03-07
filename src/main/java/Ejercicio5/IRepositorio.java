package Ejercicio5;

public interface IRepositorio {
    void agregar(IDesarrollador desarrollador);
    void eliminarTodo();
    void notificacionDesarrolladores(Commit commit);
}

