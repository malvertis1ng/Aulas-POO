package Main;

public class Marca {
    private final String nome;
    private final int nrDeModelos;
    private final int  anoLancamento;
    private final String  codigoIdentificador;

    public Marca(String nome, int nrDeModelos, int anoLancamento, String codigoIdentificador) {
        this.nome = nome;
        this.nrDeModelos = nrDeModelos;
        this.anoLancamento = anoLancamento;
        this.codigoIdentificador = codigoIdentificador;
    }

    public static void imprimirMarca(){
        System.out.println("Nome: Ferrari" );
        System.out.println("Número do modelo: 1200");
        System.out.println("Ano de lançamento: 2015");
        System.out.println("Código Identificador: 1234");
        System.out.println("");
    }
    public String getNome() {
        return nome;
    }



    public int getNrDeModelos() {
        return nrDeModelos;
    }



    public int getAnoLancamento() {
        return anoLancamento;
    }



    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }


}
