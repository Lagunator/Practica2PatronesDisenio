package Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Dispositivo {
    private Map<String, Memento> versionesTesis = new HashMap<>();

    public Dispositivo addVersionTesis(Memento memento){
        System.out.println("Guardando la versión de la tesis con fecha: " + memento.getFecha());
        versionesTesis.put(memento.getFecha(), memento);
        return this;
    }

    public Memento getTesis(String fecha){
        return versionesTesis.get(fecha);
    }

    public void mostrarVersiones(){
        System.out.println("Listado de versiones de la tesis:");
        for(Map.Entry<String, Memento> entry : versionesTesis.entrySet()){
            System.out.println("- Fecha: " + entry.getKey());
            System.out.println("  Tesis:");
            entry.getValue().getTesis().showInfo();
        }
    }
}
