public class Banco {
    private int numero;
    private double saldo;
    private String nome;

    public Banco(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta de:" + nome);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na conta de:" + nome);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void imprimirSaldo() {
        System.out.println("Saldo da conta número " + numero + ": R$ " + saldo);
    }

    public void imprimirDadosConta() {
        System.out.println("Número da conta: " + numero);
        System.out.println(" Nome: " + nome);
        imprimirSaldo();
        System.out.println();
    }
}