public class Main {
    public static void main(String[] args) {
        Banco conta1 = new Banco(12345, "Oliver");
        Banco conta2 = new Banco(56789, "Wesley");
        Banco conta3 = new Banco(56789, "Jorge");

        conta1.depositar(1000);
        conta2.depositar(500);
        conta3.depositar(200);

        conta1.sacar(300);
        conta2.sacar(100);
        conta3.sacar(50);

        conta1.imprimirDadosConta();
        conta2.imprimirDadosConta();
        conta3.imprimirDadosConta();
    }
}