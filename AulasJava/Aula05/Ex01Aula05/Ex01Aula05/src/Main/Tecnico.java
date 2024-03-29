package Main;

public class Tecnico {
    private String nome;
    private int idade;

    private int carteirinha;

    public Tecnico(String nome, int idade, int carteirinha){
        this.nome = nome;
        this.idade = idade;
        this.carteirinha = carteirinha;
    }

    public String imprimirTecnico(){
        return this.nome + " - " + this.idade + " Anos, " + "Registro de Treinador: " + this.carteirinha;
    }
}
