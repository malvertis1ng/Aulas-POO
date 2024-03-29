package Main;

public class Presidente {
    private String nome;
    private int idade;

    public Presidente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String imprimirPresidente(){
        return this.nome + " - " + this.idade + " Anos";
    }
}
