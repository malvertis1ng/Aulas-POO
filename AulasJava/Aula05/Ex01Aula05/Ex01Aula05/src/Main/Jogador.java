package Main;

public class Jogador {
    private String nome;
    private int idade;
    private int camisa;

    public Jogador(String nome, int idade, int camisa){
        this.nome = nome;
        this.idade = idade;
        this.camisa = camisa;
    }

    public String imprimirJogador(){
        return this.nome + " - " + this.idade + " Anos, " + " Camisa: " + this.camisa;
    }
}





