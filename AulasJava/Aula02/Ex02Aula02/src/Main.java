public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Jorge", 12345, 7.8, 6.3, 80);
        Aluno aluno2 = new Aluno("Eduarda", 54321, 4.9, 4.7, 90);
        Aluno aluno3 = new Aluno("Pedro", 98765, 2.4, 3.0, 70);
        Aluno aluno4 = new Aluno("Ana", 67890, 8.7, 9.0, 85);
        Aluno aluno5 = new Aluno("Carlos", 13579, 6.0, 6.5, 60);


        aluno1.imprimir();

        aluno2.imprimir();

        aluno3.imprimir();

        aluno4.imprimir();

        aluno5.imprimir();
    }
}