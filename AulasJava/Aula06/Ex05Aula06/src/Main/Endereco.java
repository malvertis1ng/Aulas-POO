package Main;

public class Endereco {
   private String rua;
   private String bairro;
   private String Complemento;
   private String estado;
   private String CEP;
   private String cidade;


   public Endereco(String rua, String bairro, String Complemento, String estado, String CEP, String cidade){
      this.rua = rua;
      this.bairro = bairro;
      this.Complemento = Complemento;
      this.estado = estado;
      this.CEP = CEP;
      this.cidade = cidade;
   }

   public void  imprimirEndereco(){
      System.out.println("Rua:" + getRua());
      System.out.println("Bairro:" + getBairro());
      System.out.println("Complemento" + getComplemento());
      System.out.println("Estado:" + getEstado());
      System.out.println("CEP" + getCEP());
      System.out.println("Cidade:" + getCidade());
   }

   public String getRua() {
      return rua;
   }

   public void setRua(String rua) {
      this.rua = rua;
   }

   public String getBairro() {
      return bairro;
   }

   public void setBairro(String bairro) {
      this.bairro = bairro;
   }

   public String getComplemento() {
      return Complemento;
   }

   public void setComplemento(String complemento) {
      Complemento = complemento;
   }

   public String getEstado() {
      return estado;
   }

   public void setEstado(String estado) {
      this.estado = estado;
   }

   public String getCEP() {
      return CEP;
   }

   public void setCEP(String CEP) {
      this.CEP = CEP;
   }

   public String getCidade() {
      return cidade;
   }

   public void setCidade(String cidade) {
      this.cidade = cidade;
   }






}
