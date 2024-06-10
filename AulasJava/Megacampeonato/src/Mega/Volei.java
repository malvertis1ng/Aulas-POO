package Mega;

public class Volei extends Campeonato implements IJogos {
    private String regras = "30 pontos, sem limite de tempo.";
    private int pontoslim = 15;

    public Volei(String nome) {
        super(nome);
    }

    public void imprimirRegras(){
        System.out.println(regras);
    }

    @Override
    public void quantJogadores() {
        System.out.println("Jogadores inscritos por curso no vôlei:");
        for(Cursos c: Mega.getCurso()) {
            System.out.println(c.getCurso() + ": " + c.getJogavolei());
        }
        System.out.println("\n");
    }

    public void adicionarPartida(PartidasVolei partida) {
        this.partida.add(partida);
        partidasrestantes--;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public int getPontoslim() {
        return pontoslim;
    }

    public void setPontoslim(int pontoslim) {
        this.pontoslim = pontoslim;
    }



}
