package Main;

public class Main {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("Yuri Alberto", 22, 9);
        Tecnico tecnico = new Tecnico("Antônio Oliveira", 38, 90231);
        Presidente presidente = new Presidente("Augusto Melo", 49);
        Estadio estadio = new Estadio("Neo Química Arena", 47605);

        Time corinthians = new Time("Corinthians", 1910, jogador, tecnico, presidente, estadio);


        corinthians.imprimirTime();





    }




}
