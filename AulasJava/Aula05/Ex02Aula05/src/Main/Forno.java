package Main;

public class Forno {
    private String tipo;
    private int potencia;


    public Forno(String tipo, int potencia){
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String imprimirForno(){
        return "Forno " + this.tipo + " de " + this.potencia + " Watts";
    }
}
