package Ejercicio6;

public abstract class Desarrollador {
    private String nombre;
    private SalaDesarrollo colega;
    private String ci;

    protected IChat salaChat;

    public Desarrollador(IChat salaChat) {
        this.salaChat = salaChat;
    }

    public String getNombre() {
        return nombre;
    }

    public Desarrollador setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public SalaDesarrollo getColega() {
        return colega;
    }

    public void setColega(SalaDesarrollo colega) {
        this.colega = colega;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}

