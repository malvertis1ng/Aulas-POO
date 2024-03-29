package Main;

public class Estadio {
    private String nome;
    private int capacidade;


    public Estadio(String nome, int capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String imprimirEstadio(){
        return this.nome + " - " + "Capacidade de: " + this.capacidade + " torcedores";
    }
}
