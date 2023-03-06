package Ejercicio1;

public class EditorContenido {
    private Tesis tesis;

    public void setTesis(Tesis tesis){
        System.out.println("Listo para guardar");
        this.tesis = tesis.clone();
    }

    public Memento createMemento(String fecha){
        return new Memento(tesis.clone(), fecha);
    }

    public Tesis recuperarTesis(Memento memento){
        if (memento != null) {
            this.tesis = memento.getTesis();
            System.out.println("Recuperando la tesis de: " + memento.getFecha());
        } else {
            System.out.println("No se puede recuperar la tesis: el memento es nulo.");
        }
        return this.tesis;
    }
}
