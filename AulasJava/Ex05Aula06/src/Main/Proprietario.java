package Main;

public class Proprietario {

    private String nome;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private Endereco endereco;
    public Proprietario(String nome, String cpf, String rg, String dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public void imprimirProprietario(){
        System.out.println("Nome do proprietário:" + getNome());
        System.out.println("CPF:" + getCpf());
        System.out.println("RG:" + getRg());
        System.out.println("Data de nascimento:" + getDataNascimento());
        System.out.println("Endereço:" + getEndereco().getRua() + "/" + getEndereco().getBairro()
        + " CEP: " + getEndereco().getCEP() + " " + getEndereco().getCidade() + "/" + getEndereco().getEstado()
        );
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
