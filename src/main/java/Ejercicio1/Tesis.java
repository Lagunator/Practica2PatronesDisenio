package Ejercicio1;

public class Tesis {
    private String contenido;
    private String nombreEstudiante;
    private String ci;

    public Tesis(String nombreEstudiante, String ci) {
        this.nombreEstudiante = nombreEstudiante;
        this.ci = ci;
        contenido = "";
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void addInfo(String nuevoTexto) {
        contenido += "\n" + nuevoTexto;
    }

    public String getContenido() {
        return contenido;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public String getCi() {
        return ci;
    }

    public void showInfo() {
        System.out.println(">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Nombre: " + nombreEstudiante);
        System.out.println("CI: " + ci);
        System.out.println("Tema: ");
        System.out.println(contenido);
    }

    public Tesis clone() {
        Tesis aux = new Tesis(nombreEstudiante, ci);
        aux.setContenido(contenido);
        return aux;
    }
}

