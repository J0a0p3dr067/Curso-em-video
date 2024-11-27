package aula.projeto_poo;

public class TecnicoFutsal {
    private String nome;
    private int idade;
    private PosicaoFutsal posicao;
    private Especialidade especialidade;
    private int pontosEspecialidade;


    public TecnicoFutsal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirPerfil() {
        System.out.println("///////////////////////////");
        System.out.println("   Perfil do Tecnico   ");
        System.out.println("///////////////////////////");
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("posição: " + posicao);
        System.out.println("Especialidade: " + especialidade );
        System.out.println("pontos de Especialidade: " + pontosEspecialidade);
    }



    
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;

        if (idade < 25) {
            System.out.println("muito jovem para ser tecnico");
        }
    }

    /**
     * @return PosiçãoFutsal return the posiçao
     */
    public PosicaoFutsal getPosicao() {
        return posicao;
    }

    /**
     * @param posiçao the posiçao to set
     */
    public void setPosicao(PosicaoFutsal posiçao) {
        this.posicao = posiçao;
    }

    /**
     * @return Especialidade return the especialidade
     */
    public Especialidade getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return int return the pontosEspecialidade
     */
    public int getPontosEspecialidade() {
        return pontosEspecialidade;
    }

    /**
     * @param pontosEspecialidade the pontosEspecialidade to set
     */
    public void setPontosEspecialidade(int pontosEspecialidade) {
        this.pontosEspecialidade = pontosEspecialidade;
    }

}
