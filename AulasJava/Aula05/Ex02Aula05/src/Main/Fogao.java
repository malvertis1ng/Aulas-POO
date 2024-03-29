package Main;

public class Fogao {
    private String cor;
    private Aquecedor aquecedor;
    private Forno forno;
    private Painel painel;
    private Tampa tampa;


    public Fogao(String cor, Aquecedor aquecedor, Forno forno, Painel painel, Tampa tampa){
        this.cor = cor;
        this.aquecedor = aquecedor;
        this.forno = forno;
        this.painel = painel;
        this.tampa = tampa;
    }


    public void imprimirFogao(){
        System.out.println("Informações do fogão:");
        System.out.println("Cor do fogão: " + getCor());
        System.out.println("Aquecedor: " + getAquecedor().imprimirAquecedor());
        System.out.println("Forno: " + getForno().imprimirForno());
        System.out.println("Painel: " + getPainel().imprimirPainel());
        System.out.println("Tampa: " + getTampa().imprimirTampa());
    }

    public Aquecedor getAquecedor() {
        return aquecedor;
    }

    public void setAquecedor(Aquecedor aquecedor) {
        this.aquecedor = aquecedor;
    }


    public Forno getForno() {
        return forno;
    }

    public void setForno(Forno forno) {
        this.forno = forno;
    }

    public Painel getPainel() {
        return painel;
    }

    public void setPainel(Painel painel) {
        this.painel = painel;
    }

    public Tampa getTampa() {
        return tampa;
    }

    public void setTampa(Tampa tampa) {
        this.tampa = tampa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
