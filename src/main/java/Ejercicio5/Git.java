package Ejercicio5;

public class Git {
    private Codigo codigo;

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public Commit createCommit(String commitID) {
        return new Commit(codigo, commitID);
    }

    public Codigo restoreCommit(Commit commit, IRepositorio repositorio) {
        System.out.println("*****RESTAURANDO*****");
        this.codigo = commit.getCodigo();
        repositorio.notificacionDesarrolladores(commit);
        return this.codigo;
    }
}

