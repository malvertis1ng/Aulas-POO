import java.time.LocalDate;

public class Data {



    private int dia;

    private int mes;

    private int ano;

    private String mesextenso;

    boolean estacao;



    public Data(int dia, int mes, int ano) {

        if(dia>=1 && dia<=30) {

            this.dia = dia;

        }else {

            System.out.println("Dia inválido, dia definido como 1");

            this.dia = 1;

        }

        if(mes>=1 && mes<=12) {

            this.mes = mes;

        }else {

            System.out.println("Mês inválido, mês definido como 1");

            this.mes = 1;

        }

        this.ano = ano;

    }



    public Data() {

        LocalDate hoje = LocalDate.now();

        this.dia = hoje.getDayOfMonth();

        this.mes = hoje.getMonthValue();

        this.ano = hoje.getYear();

    }



    public int getDia() {

        return dia;

    }



    public void setDia(int dia) {

        this.dia = dia;

    }



    public int getMes() {

        return mes;

    }



    public void setMes(int mes) {

        this.mes = mes;

    }



    public int getAno() {

        return ano;

    }



    public void setAno(int ano) {

        this.ano = ano;

    }



    public void apresentaData() {

        System.out.println(dia + "/" + mes + "/" + ano);

    }



    public void apresentaData(boolean estacao) {

        if(mes==1) {

            mesextenso = "janeiro";

        }else if(mes==2) {

            mesextenso = "fevereiro";

        }else if(mes==3) {

            mesextenso = "março";

        }else if(mes==4) {

            mesextenso = "abril";

        }else if(mes==5) {

            mesextenso = "maio";

        }else if(mes==6) {

            mesextenso = "junho";

        }else if(mes==7) {

            mesextenso = "julho";

        }else if(mes==8) {

            mesextenso = "agosto";

        }else if(mes==9) {

            mesextenso = "setembro";

        }else if(mes==10) {

            mesextenso = "outubro";

        }else if(mes==11) {

            mesextenso = "novembro";

        }else{

            mesextenso = "dezembro";

        }

        System.out.println(dia + " de " + mesextenso + " de " + ano);

        if(estacao == true) {

            if(mes==12 || mes<=2) {

                System.out.println("Verão");

            }else if(mes>=3 && mes<=5) {

                System.out.println("Outono");

            }else if(mes>=6 && mes<=8) {

                System.out.println("Inverno");

            }else {

                System.out.println("Primavera");

            }

        }

    }



    public void avancaData() {

        if(dia==30) {

            dia = 1;

            if(mes==12) {

                mes = 1;

                ano++;

            }else {

                mes++;

            }

        }else {

            dia++;

        }

    }



    public void avancaData(int qtddia) {

        int qtdmes, qtdano;



        qtdano = qtddia;



        while(qtdano>=365) {

            ano++;

            qtdano = qtdano - 365;

        }



        qtdmes = qtdano;



        while(qtdmes>=30) {

            mes++;

            qtdmes = qtdmes - 30;

        }



        dia = dia + qtdmes;



    }



}
