package Ejercicio5;

public class Codigo {
    private String codigo;

    public Codigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void showInfo() {
        System.out.println("********CODIGO*********");
        System.out.println("Lineas de codigo: " + getCodigo());
    }
}

