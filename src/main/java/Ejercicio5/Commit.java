package Ejercicio5;

public class Commit {
    private Codigo estado;
    private String id;

    public Commit(Codigo codigo, String id) {
        estado = codigo;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Codigo getCodigo() {
        return estado;
    }
}

