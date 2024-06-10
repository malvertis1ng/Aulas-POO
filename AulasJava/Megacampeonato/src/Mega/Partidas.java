package Mega;

public abstract class Partidas {
    public Cursos timeA;
    public Cursos timeB;
    public int pontostimeA;
    public int pontostimeB;
    public int tempo;
    public Cursos vencedor;
    public Cursos perdedor;
    public int tempodecorrido;
    public int tempoextra;

    public Partidas(Cursos timeA, Cursos timeB) {
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public void iniciaPartida() {
        System.out.println("Partida iniciada!");
    }

    public abstract void marcouPonto(Cursos curso);

    public void falta() {
        System.out.println("Advertência dada!");
    }

    public void falta(String cartao) {
        if(cartao == "amarelo") {
            System.out.println("Cartão amarelo!");
        }else if(cartao == "vermelho"){
            System.out.println("Cartão vermelho, expulsão!!!");
        }
    }

    public Cursos getTimeA() {
        return timeA;
    }

    public void setTimeA(Cursos timeA) {
        this.timeA = timeA;
    }

    public Cursos getTimeB() {
        return timeB;
    }

    public void setTimeB(Cursos timeB) {
        this.timeB = timeB;
    }

    public int getPontostimeA() {
        return pontostimeA;
    }

    public void setPontostimeA(int pontostimeA) {
        this.pontostimeA = pontostimeA;
    }

    public int getPontostimeB() {
        return pontostimeB;
    }

    public void setPontostimeB(int pontostimeB) {
        this.pontostimeB = pontostimeB;
    }

    public Cursos getVencedor() {
        return vencedor;
    }

    public void setVencedor(Cursos vencedor) {
        this.vencedor = vencedor;
    }



}
