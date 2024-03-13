public class Main {

    public static void main(String[] args) {

        Carro casual = new Carro("Preto", "Corsa", 4);

        Carro esporte = new Carro("Vermelho", "Hilux", 2, true);

        Carro luxo = new Carro("Branco", "Dodge Ram", 4, true, true, true);





        casual.imprimirCarro();

        esporte.imprimirCarro();

        luxo.imprimirCarro();

    }

}



