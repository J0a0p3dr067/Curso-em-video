package curso_em_video.aula12;

public class Mamifero extends Animal {

    private float corPelo;


    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Mamífero");
    }
    
    public float getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(float corPelo) {
        this.corPelo = corPelo;
    }

    
}
