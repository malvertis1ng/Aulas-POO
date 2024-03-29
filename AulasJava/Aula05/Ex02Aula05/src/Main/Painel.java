package Main;

public class Painel {
    private String tipo;
    private Botao botao;

    public Painel(String tipo, Botao botao){
        this.tipo = tipo;
        this.botao = botao;
    }

    public String imprimirPainel(){
        return "Painel " + this.tipo + " com " + getBotao().imprimirBotoes();
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Botao getBotao() {
        return botao;
    }

    public void setBotao(Botao botao) {
        this.botao = botao;
    }
}
