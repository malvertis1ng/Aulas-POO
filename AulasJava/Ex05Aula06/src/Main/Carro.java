package Main;

public class Carro {
        private static final int MARCHA_RE = -1;
        public static double consumopadrao = 10.0; // km/l

        private String modelo;
        private String cor;
        private int ano;
        private Marca marca;
        private String chassi;
        private Proprietario proprietario;
        private int velocidadeMaxima;
        private int velocidadeAtual;
        private int nrPortas;
        private boolean temTetoSolar;
        private int nrMarchas;
        private boolean temCambioAutomatico;
        private double volumeCombustivel;

        private int marcha;

        public Carro(String modelo, String cor, int ano, Marca marca, String chassi, Proprietario proprietario, int velocidadeMaxima,
                     int nrPortas, boolean temTetoSolar, int nrMarchas, boolean temCambioAutomatico, double volumeCombustivel) {
                this.modelo = modelo;
                this.cor = cor;
                this.ano = ano;
                this.marca = marca;
                this.chassi = chassi;
                this.proprietario = proprietario;
                this.velocidadeMaxima = velocidadeMaxima;
                this.nrPortas = nrPortas;
                this.temTetoSolar = temTetoSolar;
                this.nrMarchas = nrMarchas;
                this.temCambioAutomatico = temCambioAutomatico;
                this.volumeCombustivel = volumeCombustivel;
        }

        public void acelera() {
                velocidadeAtual++;
        }

        public void freia() {
                velocidadeAtual = 0;
        }

        public void trocaMarcha() {
                if (marcha < -1 || marcha > nrMarchas) {
                        System.out.println("Marcha inválida.");
                } else if (marcha == MARCHA_RE && velocidadeAtual > 0) {
                        System.out.println("Não é possível engatar a marcha ré com o carro em movimento.");
                } else {
                        System.out.println("Marcha trocada para: " + marcha);
                }
        }

        public void reduzMarcha() {
                if (velocidadeAtual > 0) {
                        System.out.println("O carro está em movimento. Reduza a velocidade para reduzir a marcha.");
                } else if (velocidadeAtual == 0) {
                        System.out.println("O carro já está parado.");
                } else {
                        System.out.println("Marcha reduzida.");
                }
        }

        public double calcularAutonomia(double consumoMedio) {
                return volumeCombustivel / consumoMedio;
        }

        public double exibirVolumeCombustivel() {
                return volumeCombustivel;
        }


        public String getModelo() {
                return modelo;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public String getCor() {
                return cor;
        }

        public void setCor(String cor) {
                this.cor = cor;
        }

        public int getAno() {
                return ano;
        }

        public void setAno(int ano) {
                this.ano = ano;
        }

        public Marca getMarca() {
                return marca;
        }

        public void setMarca(Marca marca) {
                this.marca = marca;
        }

        public String getChassi() {
                return chassi;
        }

        public void setChassi(String chassi) {
                this.chassi = chassi;
        }

        public Proprietario getProprietario() {
                return proprietario;
        }

        public void setProprietario(Proprietario proprietario) {
                this.proprietario = proprietario;
        }

        public int getVelocidadeMaxima() {
                return velocidadeMaxima;
        }

        public void setVelocidadeMaxima(int velocidadeMaxima) {
                this.velocidadeMaxima = velocidadeMaxima;
        }

        public int getVelocidadeAtual() {
                return velocidadeAtual;
        }

        public void setVelocidadeAtual(int velocidadeAtual) {
                this.velocidadeAtual = velocidadeAtual;
        }

        public int getNrPortas() {
                return nrPortas;
        }

        public void setNrPortas(int nrPortas) {
                this.nrPortas = nrPortas;
        }

        public boolean isTemTetoSolar() {
                return temTetoSolar;
        }

        public void setTemTetoSolar(boolean temTetoSolar) {
                this.temTetoSolar = temTetoSolar;
        }

        public int getNrMarchas() {
                return nrMarchas;
        }

        public void setNrMarchas(int nrMarchas) {
                this.nrMarchas = nrMarchas;
        }

        public boolean isTemCambioAutomatico() {
                return temCambioAutomatico;
        }

        public void setTemCambioAutomatico(boolean temCambioAutomatico) {
                this.temCambioAutomatico = temCambioAutomatico;
        }

        public double getVolumeCombustivel() {
                return volumeCombustivel;
        }

        public void setVolumeCombustivel(double volumeCombustivel) {
                this.volumeCombustivel = volumeCombustivel;
        }

        public void imprimirCarro() {
                System.out.println("Modelo: " + getModelo());
                System.out.println("Cor: " + getCor());
                System.out.println("Ano: " + getAno());
                System.out.println("Marca: " + getMarca().getNome());
                System.out.println("Chassi: " + getChassi());
                System.out.println("Proprietário: " + getProprietario().getNome() + " CPF: " + getProprietario().getCpf() + " RG: " + getProprietario().getRg());
                System.out.println("Velocidade Máxima: " + getVelocidadeMaxima());
                System.out.println("Número de Portas: " + getNrPortas());
                System.out.println("Cambio Automático: " + this.temCambioAutomatico);
                System.out.println("Teto solar: " + this.temTetoSolar);
                System.out.println("Volume Combustível: " + getVolumeCombustivel());
                System.out.println("");
        }
}

