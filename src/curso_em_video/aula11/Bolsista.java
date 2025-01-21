package curso_em_video.aula11;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa");
    }

    @Override
    public void PagarMensalidade() {
        System.out.println(getNome() + "Mensalidadade paga");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
