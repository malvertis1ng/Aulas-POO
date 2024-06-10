package Mega;

import java.util.Random;

public class PartidasBasquete extends Partidas {

    public PartidasBasquete(Cursos timeA, Cursos timeB) {
        super(timeA, timeB);
        tempo = 600;
    }

    public void marcouPonto(Cursos curso) {
        if(curso.getCurso() == timeA.getCurso()) {
            pontostimeA++;
            System.out.println("Ponto para " + timeA.getCurso());
            System.out.println(timeA.getCurso() + ": " + pontostimeA + " / " + timeB.getCurso() + ": " + pontostimeB);
        }else if(curso.getCurso() == this.timeB.getCurso()) {
            pontostimeB++;
            System.out.println("Ponto para " + timeB.getCurso());
            System.out.println(timeA.getCurso() + ": " + pontostimeA + " / " + timeB.getCurso() + ": " + pontostimeB);
        }else {
            System.out.println("Time inexistente na partida!");
        }

        Random random = new Random();
        tempodecorrido = random.nextInt(600);

        tempo -= tempodecorrido;

        if(pontostimeA == 12) {
            System.out.println("Fim de jogo!!! Vitória para " + timeA.getCurso() + "\n");
            vencedor = timeA;
            perdedor = timeB;
            if(Basquete.getPartidasrestantes() == 1) {
                vencedor.setPontos(Mega.getMedbronze());
            }
            if(Basquete.getPartidasrestantes() == 0) {
                perdedor.setPontos(Mega.getMedprata());
                vencedor.setPontos(Mega.getMedouro());
            }
        }else if(pontostimeB == 12) {
            System.out.println("Fim de jogo!!! Vitória para " + timeB.getCurso() + "\n");
            vencedor = timeB;
            perdedor = timeA;
            if(Basquete.getPartidasrestantes() == 1) {
                vencedor.setPontos(Mega.getMedbronze());
            }
            if(Basquete.getPartidasrestantes() == 0) {
                perdedor.setPontos(Mega.getMedprata());
                vencedor.setPontos(Mega.getMedouro());
            }
        }

        if(tempo < 1) {
            if(pontostimeA > pontostimeB) {
                System.out.println("Fim de jogo!!! Tempo esgotado.");
                System.out.println("Vitória para " + timeA.getCurso() + "\n");
                vencedor = timeA;
                perdedor = timeB;
                if(Basquete.getPartidasrestantes() == 1) {
                    vencedor.setPontos(Mega.getMedbronze());
                }
                if(Basquete.getPartidasrestantes() == 0) {
                    perdedor.setPontos(Mega.getMedprata());
                    vencedor.setPontos(Mega.getMedouro());
                }
            }else if(pontostimeA < pontostimeB) {
                System.out.println("Fim de jogo!!! Tempo esgotado.");
                System.out.println("Vitória para " + timeB.getCurso() + "\n");
                vencedor = timeB;
                perdedor = timeA;
                if(Basquete.getPartidasrestantes() == 1) {
                    vencedor.setPontos(Mega.getMedbronze());
                }
                if(Basquete.getPartidasrestantes() == 0) {
                    perdedor.setPontos(Mega.getMedprata());
                    vencedor.setPontos(Mega.getMedouro());
                }
            }else {
                tempoextra = random.nextInt(60);
                System.out.println("Empate!! Acréscimo de tempo para o desempate: +" + tempoextra + "sec");
                tempo = tempoextra;
            }
        }

    }

}
