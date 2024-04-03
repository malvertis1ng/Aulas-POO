package Main;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        Pneu[] pneus = {new Pneu("Pneu dianteiro esquerdo"), new Pneu("Pneu dianteiro direito"),
                new Pneu("Pneu traseiro esquerdo"), new Pneu("Pneu traseiro direito")};
        Carro carro = new Carro(motor, pneus);

        carro.mostrarInformacoes();

        carro.ligarMotor();
        carro.substituirPneu(2, new Pneu("Novo pneu traseiro esquerdo"));
        carro.substituirTodosPneus(new Pneu[]{new Pneu("Novo pneu dianteiro esquerdo"),
                new Pneu("Novo pneu dianteiro direito"),
                new Pneu("Novo pneu traseiro esquerdo"),
                new Pneu("Novo pneu traseiro direito")});

        carro.mostrarInformacoes();

        carro.desligarMotor();
    }
}