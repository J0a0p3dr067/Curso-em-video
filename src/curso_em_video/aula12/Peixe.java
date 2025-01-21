package curso_em_video.aula12;

public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("nadando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo subtancoias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }

    public void soltarBolha() {
        System.out.println("Soutando bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}
