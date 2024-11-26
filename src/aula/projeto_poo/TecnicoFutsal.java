package aula.projeto_poo;

public class TecnicoFutsal {
    private String nome;
    private int idade;
    private PosiçãoFutsal posiçao;
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
        System.out.println("posição: " + posiçao);
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
    }

    /**
     * @return PosiçãoFutsal return the posiçaõ
     */
    public PosiçãoFutsal getPosiçaõ() {
        return posiçaõ;
    }

    /**
     * @param posiçaõ the posiçaõ to set
     */
    public void setPosiçaõ(PosiçãoFutsal posiçaõ) {
        this.posiçaõ = posiçaõ;
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
