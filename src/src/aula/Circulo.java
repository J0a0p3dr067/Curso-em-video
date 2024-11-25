package aula;
public class Circulo {
    private static int n_circulos;
    private double raio;
    private String cor;


    


    Circulo() {
        this.setRaio(raio);
        this.setCor("BRANCO");

        Circulo.n_circulos++;
    }

    Circulo(double raio, String cor) {
        this.setRaio(raio);
        this.setCor(cor);

        Circulo.n_circulos++;
    }
    
    public double getRaio() {
        return this.raio;
    }

    
    public boolean setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
            return true;
        }
        return false;
    }

    
    public String getCor() {
        return this.cor;
    }

    
    public boolean setCor(String cor) {
         cor.toUpperCase();

         if ( cor == "BRANCO" || cor == "PRETO" ||
              cor == "AZUL" || cor == "AMARELO" ||
              cor =="VERMELHO" || cor == "VERDE") {
            return true;
         }
         return false;
    }

    public static int getNcirculos() {
        return Circulo.n_circulos;
    }
}
