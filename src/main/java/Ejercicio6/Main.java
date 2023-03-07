package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        ChatIndividual chatIndividual = new ChatIndividual();
        ChatGrupal chatGrupal = new ChatGrupal();

        SalaDesarrollo desarrollador1 = new SalaDesarrollo(chatIndividual);
        SalaDesarrollo desarrollador2 = new SalaDesarrollo(chatIndividual);

        chatIndividual.addDesarrolador(desarrollador1).addDesarrolador(desarrollador2);

        desarrollador1.setNombre("Jaime").setCi("92827AJHRD");
        desarrollador2.setNombre("Javier").setCi("37759JSHGR");

        desarrollador1.setColega(desarrollador2);

        desarrollador1.send("Buenos días.");

        System.out.println("***************************************************");

        SalaDesarrollo desarrollador3 = new SalaDesarrollo(chatGrupal);
        SalaDesarrollo desarrollador4 = new SalaDesarrollo(chatGrupal);
        SalaDesarrollo desarrollador5 = new SalaDesarrollo(chatGrupal);


        desarrollador3.setNombre("Pablo").setCi("389457AJJDYBV");
        desarrollador4.setNombre("Gerardo").setCi("3099DHJEGBD");
        desarrollador5.setNombre("Armando").setCi("6512AJDYGVCC");

        chatGrupal.addDesarrolador(desarrollador3)
                .addDesarrolador(desarrollador4).addDesarrolador(desarrollador5);


        desarrollador4.send("Entren a Trabajar.");

    }
}

