package Mega;

public class Handebol extends Campeonato implements IJogos {
    private String regras = "Limite de 10 min, sem limite de pontuação.";
    private int tempolim = 600;

    public Handebol(String nome) {
        super(nome);
    }

    public void imprimirRegras(){
        System.out.println(regras);
    }

    @Override
    public void quantJogadores() {
        System.out.println("Jogadores inscritos por curso no handebol:");
        for(Cursos c: Mega.getCurso()) {
            System.out.println(c.getCurso() + ": " + c.getJogahand());
        }
        System.out.println("\n");
    }

    public void adicionarPartida(PartidasHandebol partida) {
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



}
