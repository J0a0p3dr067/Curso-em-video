package aula;
public class Carro {
 // atributos
   private String cor;
   private String modelo;
   private boolean ligado;
   private int ano;

   // metodos de settins

  void setAno(int ano) {
    if (ano >= 1950) {
      this.ano = ano;
    }
  }
  public void setCor(String cor) {
      this.cor = cor;
  }
  public void setLigado(boolean ligado) {
      this.ligado = ligado;
  }
  public void setModelo(String modelo) {
      this.modelo = modelo;
  }


 //açoes
    
void pintar(String cor) {
    this.cor = cor;
}

 void ligar() {
    ligado = true;
 }

 void desligar() {
    ligado = false;
 }

 void exibir() {

   System.out.println("********* informaçoes ***********");
        System.out.println("Ano do carro: " + ano);
        System.out.println("cor do carro: " + cor);
        System.out.println("modelo do carro: " + modelo);
        
        if (this.ligado) {
         System.out.println("Ligado");
        } else {
         System.out.println("Desligado");
        }
 }

    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return boolean return the ligado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * @return int return the ano
     */
    public int getAno() {
        return ano;
    }

}
