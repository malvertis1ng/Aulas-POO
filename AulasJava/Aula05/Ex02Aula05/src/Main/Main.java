package Main;

public class Main {
    public static void main(String[] args) {
        Aquecedor aquecedor = new Aquecedor("Elétrico", 8, 25);
        Botao botao = new Botao("Acrilico", 6);
        Forno forno = new Forno("Elétrico", 220);
        Tampa tampa = new Tampa("Vidro");
        Painel painel = new Painel("Digital", botao);

        Fogao fogao = new Fogao("Preto", aquecedor, forno, painel, tampa);

        fogao.imprimirFogao();
    }
}