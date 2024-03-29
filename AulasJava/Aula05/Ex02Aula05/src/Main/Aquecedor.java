package Main;

public class Aquecedor {
    private String tipo;
    private int quantidade;

    private int potencia;


    public Aquecedor(String tipo, int quantidade, int potencia){
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.potencia = potencia;
    }

    public String imprimirAquecedor(){
        return "Aquecedor " + this.tipo + " com " + this.quantidade + " unidades com potência de " + this.potencia + " Watts cada";
    }
}
