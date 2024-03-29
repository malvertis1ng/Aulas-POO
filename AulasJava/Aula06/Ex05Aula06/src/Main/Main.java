package Main;

public class Main {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua José das Flores", "Bairro Santa Luzia", "Casa", "SP", "1200-902", "São Paulo");
        Proprietario p1 = new Proprietario("Jorge", "500.432.904-55", "90.892.903-X", "15/08/1980", e1);
        Marca m1 = new Marca("Ferrari", 5, 2014, "90");
        Carro c1 = new Carro("Ferrari", "Branca", 2015, m1, "15094", p1, 180, 4, true, 6, true, 100);

        Marca.imprimirMarca();

        p1.imprimirProprietario();
        c1.imprimirCarro();


        c1.acelera();
        System.out.println("Velocidade atual: " + c1.getVelocidadeAtual() + " km/h");

        c1.reduzMarcha();
        c1.trocaMarcha();

        c1.freia();



        System.out.println("Autonomia do veículo: " + c1.calcularAutonomia(Carro.consumopadrao) + " km");
        System.out.println("Volume de combustível: " + c1.exibirVolumeCombustivel() + " litros");




    }
}