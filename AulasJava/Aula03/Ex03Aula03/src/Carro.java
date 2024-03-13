public class Carro {

    private String tipo;

    private String cor;

    private String modelo;

    private int quantidadePortas;

    private boolean tracao4x4;

    private boolean bancoDeCouro;

    private boolean arCondicionado;



    public Carro(String cor, String modelo, int quantidadePortas) {

        this.tipo = "Casual";

        this.cor = cor;

        this.modelo = modelo;

        this.quantidadePortas = quantidadePortas;

    }





    public Carro(String cor, String modelo, int quantidadePortas, boolean tracao4x4) {

        this.tipo = "Esporte";

        this.cor = cor;

        this.modelo = modelo;

        this.quantidadePortas = quantidadePortas;

        this.tracao4x4 = tracao4x4;

    }





    public Carro(String cor, String modelo, int quantidadePortas, boolean tracao4x4, boolean bancoDeCouro, boolean arCondicionado) {

        this.tipo = "Luxo";

        this.cor = cor;

        this.modelo = modelo;

        this.quantidadePortas = quantidadePortas;

        this.tracao4x4 = tracao4x4;

        this.bancoDeCouro = bancoDeCouro;

        this.arCondicionado = arCondicionado;

    }





    public void imprimirCarro() {

        System.out.println("Tipo: " + tipo);

        System.out.println("Cor: " + cor);

        System.out.println("Modelo: " + modelo);

        System.out.println("Quantidade de portas: " + quantidadePortas);

        System.out.println("Tração 4x4: " + tracao4x4);

        System.out.println("Banco de couro: " + bancoDeCouro);

        System.out.println("Ar condicionado: " + arCondicionado);

        System.out.println();

    }

}






