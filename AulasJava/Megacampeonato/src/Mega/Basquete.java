package Mega;

public class Basquete extends Campeonato implements IJogos {
    private String regras = "Limite de 10 min e 12 pontos.";
    private int tempolim = 600;
    private int pontoslim = 12;

    public Basquete(String nome) {
        super(nome);
    }

    public void imprimirRegras(){
        System.out.println(regras);
    }

    @Override
    public void quantJogadores() {
        System.out.println("Jogadores inscritos por curso no basquete:");
        for(Cursos c: Mega.getCurso()) {
            System.out.println(c.getCurso() + ": " + c.getJogabasq());
        }
        System.out.println("\n");
    }

    public void adicionarPartida(PartidasBasquete partida) {
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
