package Main;

public class Time {
    private String nome;
    private int anofundacao;

    private Jogador jogador;

    private Tecnico tecnico;

    private Presidente presidente;

    private Estadio estadio;

    public Time(String nome, int anofundacao, Jogador jogador, Tecnico tecnico, Presidente presidente, Estadio estadio){
        this.nome = nome;
        this.anofundacao = anofundacao;
        this.jogador = jogador;
        this.tecnico = tecnico;
        this.presidente = presidente;
        this.estadio = estadio;
    }

    public void imprimirTime(){
        System.out.println("Nome do time: " + getNome());
        System.out.println("Ano de Fundaçção: " + getAnofundacao());
        System.out.println("Jogador Principal: " + getjogador().imprimirJogador());
        System.out.println("Técnico: " + gettecnico().imprimirTecnico());
        System.out.println("Presidente: " + getpresidente().imprimirPresidente());
        System.out.println("Estádio: " + getestadio().imprimirEstadio());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnofundacao(){
        return anofundacao;
    }
    public void setAnoFundacao(int anofundacao) {
        this.anofundacao = anofundacao;
    }
    public Jogador getjogador() {
        return jogador;
    }
    public void setjogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Tecnico gettecnico(){
        return tecnico;
    }

    public void settecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Presidente getpresidente(){
        return presidente;
    }

    public void setpresidente(Presidente presidente){
        this.presidente = presidente;
    }

    public Estadio getestadio(){
        return estadio;
    }

    public void setestadio(Estadio estadio){
        this.estadio = estadio;
    }


}



