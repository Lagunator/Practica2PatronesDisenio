package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        EditorContenido word = new EditorContenido();
        Dispositivo compu = new Dispositivo();

        Tesis tesis = new Tesis("60948", "Jhosias Laguna");

        tesis.addInfo("Primera Revision");
        word.setTesis(tesis);
        compu.addVersionTesis(word.createMemento("4.3.23"));

        tesis.addInfo("Segunda Revision");
        word.setTesis(tesis);
        compu.addVersionTesis(word.createMemento("5.3.23"));

        tesis.addInfo("Tercera Revision");
        word.setTesis(tesis);
        compu.addVersionTesis(word.createMemento("6.3.23"));

        tesis.addInfo("Cuarta Revision");
        word.setTesis(tesis);
        compu.addVersionTesis(word.createMemento("9.6.23"));

        tesis.addInfo("Quinta Revision");
        word.setTesis(tesis);
        compu.addVersionTesis(word.createMemento("10.12.23"));

        tesis.showInfo();

        Memento memento = compu.getTesis("4.3.23");
        if (memento != null) {
            tesis = word.recuperarTesis(memento);
            tesis.showInfo();
        } else {
            System.out.println("No se encontró la versión de la tesis solicitada");
        }
    }
}

