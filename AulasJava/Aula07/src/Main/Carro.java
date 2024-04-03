package Main;

public class Carro {
    private Motor motor;
    private Pneu[] pneus;

    public Carro(Motor motor, Pneu[] pneus) {
        this.motor = motor;
        this.pneus = pneus;
    }

    public void ligarMotor() {
        motor.ligar();
    }

    public void desligarMotor() {
        motor.desligar();
    }

    public void substituirPneu(int indice, Pneu novoPneu) {
        if (indice >= 0 && indice < pneus.length) {
            pneus[indice] = novoPneu;
        } else {
            System.out.println("Índice inválido para substituição de pneu.");
        }
    }

    public void substituirTodosPneus(Pneu[] novosPneus) {
        if (novosPneus.length == pneus.length) {
            pneus = novosPneus;
        } else {
            System.out.println("Número de pneus fornecidos não corresponde ao número de pneus do carro.");
        }
    }

    public boolean motorEstaLigado() {
        return motor.estaLigado();
    }

    public void mostrarInformacoes() {
        System.out.println("Informações do Carro:");
        System.out.println("Estado do motor: " + (motorEstaLigado() ? "Ligado" : "Desligado"));
        System.out.println("Informações do Motor:");
        motor.mostrarInformacoes();
        System.out.println("Informações dos Pneus:");
        for (int i = 0; i < pneus.length; i++) {
            System.out.println("Pneu " + (i + 1) + ": " + pneus[i].getInformacoes());
        }
    }
}
