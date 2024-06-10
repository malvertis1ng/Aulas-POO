package Mega;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int number;
        int chancefalta;

        Mega mega = new Mega();

        Handebol handebol = new Handebol("Handebol");
        Volei volei = new Volei("Volei");
        Futebol futebol = new Futebol("Futebol");
        Basquete basquete = new Basquete ("Basquete");

        Cursos si = new Cursos("Sistemas", 10, 8, 9, 4);
        Cursos educa = new Cursos("Educa", 11, 9, 8, 4);
        Cursos fisio = new Cursos("Fisio", 9, 8, 8, 5);
        Cursos engenharia = new Cursos("Engenharia", 9, 8, 9, 5);

        mega.inscrever(engenharia);
        mega.inscrever(fisio);
        mega.inscrever(educa);
        mega.inscrever(si);

        handebol.quantJogadores();
        volei.quantJogadores();
        futebol.quantJogadores();
        basquete.quantJogadores();

        PartidasFutebol partidasemifut1 = new PartidasFutebol(si, educa);
        futebol.adicionarPartida(partidasemifut1);
        partidasemifut1.iniciaPartida();
        while(partidasemifut1.tempo > 0 && partidasemifut1.pontostimeA < 4 && partidasemifut1.pontostimeB < 4) {
            Random random = new Random();
            chancefalta = random.nextInt(5);

            if(chancefalta == 0) {
                chancefalta = random.nextInt(3);
                if(chancefalta == 0) {
                    partidasemifut1.falta();
                }else if(chancefalta == 1) {
                    partidasemifut1.falta("amarelo");
                }else {
                    partidasemifut1.falta("vermelho");
                }
            }

            number = random.nextInt(2);
            if(number == 0) {
                partidasemifut1.marcouPonto(educa);
            }else if(number == 1){
                partidasemifut1.marcouPonto(si);
            }


        }

        PartidasFutebol partidasemifut2 = new PartidasFutebol(fisio, engenharia);
        futebol.adicionarPartida(partidasemifut2);
        partidasemifut2.iniciaPartida();
        while(partidasemifut2.tempo > 0 && partidasemifut2.pontostimeA < 4 && partidasemifut2.pontostimeB < 4) {
            Random random = new Random();
            chancefalta = random.nextInt(5);

            if(chancefalta == 0) {
                chancefalta = random.nextInt(3);
                if(chancefalta == 0) {
                    partidasemifut1.falta();
                }else if(chancefalta == 1) {
                    partidasemifut1.falta("amarelo");
                }else {
                    partidasemifut1.falta("vermelho");
                }
            }

            number = random.nextInt(2);
            if(number == 0) {
                partidasemifut2.marcouPonto(fisio);
            }else if(number == 1){
                partidasemifut2.marcouPonto(engenharia);
            }
        }

        PartidasFutebol partidadispterceirofut = new PartidasFutebol(partidasemifut1.perdedor, partidasemifut2.perdedor);
        futebol.adicionarPartida(partidadispterceirofut);
        partidadispterceirofut.iniciaPartida();
        while(partidadispterceirofut.tempo > 0 && partidadispterceirofut.pontostimeA < 4 && partidadispterceirofut.pontostimeB < 4) {
            Random random = new Random();
            chancefalta = random.nextInt(5);

            if(chancefalta == 0) {
                chancefalta = random.nextInt(3);
                if(chancefalta == 0) {
                    partidasemifut1.falta();
                }else if(chancefalta == 1) {
                    partidasemifut1.falta("amarelo");
                }else {
                    partidasemifut1.falta("vermelho");
                }
            }

            number = random.nextInt(2);
            if(number == 0) {
                partidadispterceirofut.marcouPonto(partidasemifut1.perdedor);
            }else if(number == 1){
                partidadispterceirofut.marcouPonto(partidasemifut2.perdedor);
            }
        }

        PartidasFutebol partidafinalfut = new PartidasFutebol(partidasemifut1.vencedor, partidasemifut2.vencedor);
        futebol.adicionarPartida(partidadispterceirofut);
        partidafinalfut.iniciaPartida();
        while(partidafinalfut.tempo > 0 && partidafinalfut.pontostimeA < 4 && partidafinalfut.pontostimeB < 4) {
            Random random = new Random();
            chancefalta = random.nextInt(5);

            if(chancefalta == 0) {
                chancefalta = random.nextInt(3);
                if(chancefalta == 0) {
                    partidasemifut1.falta();
                }else if(chancefalta == 1) {
                    partidasemifut1.falta("amarelo");
                }else {
                    partidasemifut1.falta("vermelho");
                }
            }

            number = random.nextInt(2);
            if(number == 0) {
                partidafinalfut.marcouPonto(partidasemifut1.vencedor);
            }else if(number == 1){
                partidafinalfut.marcouPonto(partidasemifut2.vencedor);
            }
        }

        mega.listarCursos();

    }

}
