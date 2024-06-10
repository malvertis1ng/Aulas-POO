package Mega;

public class Futebol extends Campeonato implements IJogos {
    private String regras = "Limite de 15 min e 4 gols.";
    private int tempolim = 900;
    private int pontoslim = 4;

    public Futebol(String nome) {
        super(nome);
    }

    public void imprimirRegras(){
        System.out.println(regras);
    }

    @Override
    public void quantJogadores() {
        System.out.println("Jogadores inscritos por curso no futebol:");
        for(Cursos c: Mega.getCurso()) {
            System.out.println(c.getCurso() + ": " + c.getJogafut());
        }
        System.out.println("\n");
    }

    public void adicionarPartida(PartidasFutebol partida) {
        this.partida.add(partida);
        partidasrestantes--;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public int getTempolim() {
        return tempolim;
    }

    public void setTempolim(int tempolim) {
        this.tempolim = tempolim;
    }

    public int getPontoslim() {
        return pontoslim;
    }

    public void setPontoslim(int pontoslim) {
        this.pontoslim = pontoslim;
    }

}
