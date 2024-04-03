package Main;

public class Motor {
    private boolean ligado;

    public Motor() {
        ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Motor ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Motor desligado.");
    }

    public boolean estaLigado() {
        return ligado;
    }

    public void mostrarInformacoes() {
        System.out.println("Estado do Motor: " + (estaLigado() ? "Ligado" : "Desligado"));
    }
}
