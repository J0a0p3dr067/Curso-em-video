package curso_em_video.aula12;

public class Reptil extends Animal {
    private float corEscama;


    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Réptil");
    }
    public float getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(float corEscama) {
        this.corEscama = corEscama;
    }

    
}
