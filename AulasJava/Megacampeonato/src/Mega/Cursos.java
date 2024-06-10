package Mega;

public class Cursos {
    private String curso;
    private int pontos;
    private int jogahand;
    private int jogavolei;
    private int jogafut;
    private int jogabasq;

    public Cursos(String curso, int jogahand, int jogavolei, int jogafut, int jogabasq){
        this.curso = curso;
        this.jogahand = jogahand;
        this.jogavolei = jogavolei;
        this.jogafut = jogafut;
        this.jogabasq = jogabasq;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getJogahand() {
        return jogahand;
    }

    public int getJogavolei() {
        return jogavolei;
    }

    public int getJogafut() {
        return jogafut;
    }

    public int getJogabasq() {
        return jogabasq;
    }



}
