package Mega;

import java.util.ArrayList;

public class Mega {
    private final int maxcurso = 4;
    private int quantcurso;
    private static ArrayList<Cursos> curso;
    private final static int medouro = 3;
    private final static int medprata = 2;
    private final static int medbronze = 1;

    public Mega() {
        this.curso = new ArrayList<>();
    }

    public void inscrever(Cursos curso) {
        if(this.quantcurso < this.maxcurso) {
            this.curso.add(curso);
            System.out.println(this.curso.get(quantcurso).getCurso() + " inscrito para o Mega!\n");
            this.quantcurso ++;
        }else {
            System.out.println("Máximo de cursos inscritos!\n");
        }

    }

    public void listarCursos() {
        System.out.println("Cursos disputando o Mega:");
        for(Cursos c: curso) {
            System.out.println(c.getCurso() + ", pontos atuais: " + c.getPontos());
        }

        System.out.println("\n");

    }

    public int getQuantcurso() {
        return quantcurso;
    }

    public void setQuantcurso(int quantcurso) {
        this.quantcurso = quantcurso;
    }

    public static ArrayList<Cursos> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<Cursos> curso) {
        this.curso = curso;
    }

    public int getMaxcurso() {
        return maxcurso;
    }

    public static int getMedouro() {
        return medouro;
    }

    public static int getMedprata() {
        return medprata;
    }

    public static int getMedbronze() {
        return medbronze;
    }



}
