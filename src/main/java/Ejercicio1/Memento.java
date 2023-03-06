package Ejercicio1;

public class Memento {
    private Tesis tesis;
    private String fecha;

    public Memento(Tesis tesis, String fecha) {
        this.tesis = tesis;
        this.fecha = fecha;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public String getFecha() {
        return fecha;
    }
}
