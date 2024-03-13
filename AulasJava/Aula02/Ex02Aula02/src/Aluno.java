public class Aluno {
    private String nome;
    private int RA;
    private double notaA1;
    private double notaA2;
    private double media;
    private double frequencia;

    public Aluno(String nome, int RA, double notaA1, double notaA2, double frequencia) {
        this.nome = nome;
        this.RA = RA;
        this.notaA1 =  notaA1;
        this.notaA2 =  notaA2;
        this.media =  calcularMedia();
        this.frequencia =  frequencia;
    }
    private double calcularMedia() {
        return (notaA1 + (2 * notaA2)) / 3;
    }
    public String verificar() {
        if (frequencia >= 75) {
            if(media>= 5) {
                return "Aprovado!";
            } else if(media >= 3) {
                return "RE!";
            } else {
                return "Reprovado!";
            }
        } else {
            return "Reprovado!";
        }
    }

    public void imprimir() {
        System.out.println("Nome:" + nome);
        System.out.println("RA:" + RA);
        System.out.println("Nota A1:" + notaA1);
        System.out.println("Nota A2:" + notaA2);
        System.out.println("Média:" + media);
        System.out.println("Frequência:" + frequencia);
        System.out.println("Resultado final:" + verificar());
        System.out.println("\n");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public double getNotaA1() {
        return notaA1;
    }

    public void setNotaA1(double notaA1) {
        this.notaA1 = notaA1;
    }

    public double getNotaA2() {
        return notaA2;
    }

    public void setNotaA2(double notaA2) {
        this.notaA2 = notaA2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
}









