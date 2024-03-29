package Main;

public class Tampa {
    private String material;

    public Tampa(String material){
        this.material = material;
    }
    public String imprimirTampa(){
        return "Tampa de " + this.material;
    }
}
