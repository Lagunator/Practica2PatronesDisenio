package Ejercicio5;

public class Desarrollador implements IDesarrollador {
    private String nombre;

    public Desarrollador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg, Commit commit) {
        System.out.println("Mensaje para " + nombre + ": " + msg + "; adjunto con el commit: " + commit.getId());
    }
}

