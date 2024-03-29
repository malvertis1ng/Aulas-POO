package Main;

public class Botao {
    private String material;
    private int botoes;


    public Botao(String material, int botoes){
        this.material = material;
        this.botoes = botoes;
    }

    public String imprimirBotoes(){
        return this.botoes + " botões de " + this.material;
    }
}
