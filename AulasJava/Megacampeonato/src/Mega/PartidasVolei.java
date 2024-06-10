package Mega;

public class PartidasVolei extends Partidas {

    public PartidasVolei(Cursos timeA, Cursos timeB) {
        super(timeA, timeB);
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

        if(pontostimeA == 30) {
            System.out.println("Fim de jogo!!! Vitória para " + timeA.getCurso() + "\n");
            vencedor = timeA;
            perdedor = timeB;
            if(Volei.getPartidasrestantes() == 1) {
                vencedor.setPontos(Mega.getMedbronze());
            }
            if(Volei.getPartidasrestantes() == 0) {
                perdedor.setPontos(Mega.getMedprata());
                vencedor.setPontos(Mega.getMedouro());
            }
        }else if(pontostimeB == 30) {
            System.out.println("Fim de jogo!!! Vitória para " + timeB.getCurso() + "\n");
            vencedor = timeB;
            perdedor = timeA;
            if(Volei.getPartidasrestantes() == 1) {
                vencedor.setPontos(Mega.getMedbronze());
            }
            if(Volei.getPartidasrestantes() == 0) {
                perdedor.setPontos(Mega.getMedprata());
                vencedor.setPontos(Mega.getMedouro());
            }
        }

    }

}
