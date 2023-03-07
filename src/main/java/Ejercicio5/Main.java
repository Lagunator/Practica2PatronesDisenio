package Ejercicio5;

public class Main {
        public static void main(String[] args) {
            Git git = new Git();
            Repositorio repositorio = new Repositorio();

            repositorio.agregar(new Desarrollador("Jonas"));
            repositorio.agregar(new Desarrollador("Joaquin"));
            repositorio.agregar(new Desarrollador("Peter"));

            Codigo codigo;

            codigo = new Codigo("Hello world!");

            git.setCodigo(codigo);
            repositorio.createCommit("Primer commit", git.createCommit("SDS74879"));

            codigo = new Codigo("Cuando caliento el sol aqui en la playa");

            git.setCodigo(codigo);
            repositorio.createCommit("Segundo commit", git.createCommit("ASD787787"));

            codigo = new Codigo("El Alto de pie nunca de rodillas");

            git.setCodigo(codigo);
            repositorio.createCommit("Tercer commit", git.createCommit("ASDSA89794"));

            codigo = new Codigo("La Paz Ciudad Maravilla");

            git.setCodigo(codigo);
            repositorio.createCommit("Cuarto commit", git.createCommit("SADASD74984"));

            codigo = new Codigo("No presionar alt + f4");

            git.setCodigo(codigo);
            repositorio.createCommit("Quinto commit", git.createCommit("45646ASD"));

            codigo.showInfo();

            codigo = git.restoreCommit(repositorio.getCommit("Primer commit"), repositorio);

            codigo.showInfo();

            repositorio.eliminarTodo();

            repositorio.agregar(new Desarrollador("Hugo"));
            repositorio.agregar(new Desarrollador("Jonas"));
            repositorio.agregar(new Desarrollador("Ignacio"));

            codigo = git.restoreCommit(repositorio.getCommit("Quinto commit"), repositorio);

            codigo.showInfo();
        }
    }



