package Mega;

import java.util.ArrayList;

public abstract class Campeonato {
    public String nomedoesporte;
    public ArrayList<Partidas> partida;
    public static int partidasrestantes = 4;

    public Campeonato(String nomedoesporte) {
        this.nomedoesporte = nomedoesporte;
        this.partida = new ArrayList<>();
        partidasrestantes = 4;
    }

    public void quantJogadores() {
        System.out.println("Jogadores inscritos por curso:\n");
    }

    public void adicionarPartida(Partidas partida) {
        this.partida.add(partida);
    }

    public String getNomedoesporte() {
        return nomedoesporte;
    }

    public void setNomedoesporte(String nomedoesporte) {
        this.nomedoesporte = nomedoesporte;
    }

    public ArrayList<Partidas> getPartida() {
        return partida;
    }

    public void setPartida(ArrayList<Partidas> partida) {
        this.partida = partida;
    }

    public static int getPartidasrestantes() {
        return partidasrestantes;
    }

    public void setPartidasrestantes(int partidasrestantes) {
        this.partidasrestantes = partidasrestantes;
    }

}
