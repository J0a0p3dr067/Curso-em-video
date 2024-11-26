package curso_em_video.aula2;

public class Caneta {

    /////// atributos /////////
    private String modelo;
    private String cor;
    private float ponta;
    protected int carga;
    protected boolean tampado;

    ////////// Metodos ///////////// 

    public void status() {
        System.out.println("//////////////////////////////////");
        System.out.println("Sua caneta é " + this.cor);
        System.out.println("A caneta esta " + this.tampado);
        System.out.println("A ponta da caneta é " + this.ponta);
        System.out.println("O modelo da caneta é " + this.modelo);
        System.out.println("e a carga da caneta ta em " + this.carga);

    }    

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.setPonta(ponta);
        this.tampar();
    }

    public void rabiscar() {
        if (this.tampado == true) {
            System.out.println("ERRO não posso rabisca com ela tamapado");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar() {
        this.tampado = true;

    }
    protected void destampar () {
        this.tampado = false;
    }


    /////////////////////////////

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
 
    public float getPonta() {
        return ponta;
    }

   
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

}


