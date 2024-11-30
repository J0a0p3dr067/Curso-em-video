package aula.projeto_poo;

public class JogadorFutsal {
    private String nome;
    private int idade;
    private int numero;
    private int gols_totais;
    private int gols_campeonato;
    private int pontos_ataque;
    private int pontos_defesa;
    private PosicaoFutsal posicao;
    private int n_jogador;


    public JogadorFutsal(String nome, int idade, PosicaoFutsal posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.gols_totais = 0;
        this.n_jogador = 0;


        if (pontos_ataque >=1 && pontos_ataque <= 15)  {
            System.out.println("Jogador nos paramentros");
        } 
         else {
            System.out.println("Pontos de ataque invalido");
        }
        if (pontos_defesa >=1 && pontos_defesa <= 15)  {
            System.out.println("Jogador nos paramentros");
        } else {
            System.out.println("Pontos de ataque invalido");
        }
    }

    private void gerarPontos() {

    }

    public void registrarGol() {

    }
    public void reiniciarGolscampeonato() {

    }

    public void exibirPerfil() {
        System.out.println("///////////////////////////////");
        System.out.println("     Perfil do Jogador    ");
        System.out.println("////////////////////////////////");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Numero da camisa: " + numero );
        System.out.println("gols totais: " + gols_totais);
        System.out.println("gols de campeonato: " + gols_campeonato);
        System.out.println("ataque: " + pontos_ataque);
        System.out.println("defesa: " + pontos_defesa);
        System.out.println("posição: " + posicao);
    
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getGols_totais() {
        return gols_totais;
    }

    public void setGols_totais(int gols_totais) {
        this.gols_totais = gols_totais;
    }

    public int getGols_campeonato() {
        return gols_campeonato;
    }

    public void setGols_campeonato(int gols_campeonato) {
        this.gols_campeonato = gols_campeonato;
    }

    public int getPontos_ataque() {
        return pontos_ataque;
    }

    public void setPontos_ataque(int pontos_ataque) {
        this.pontos_ataque = pontos_ataque;
    }

    public int getPontos_defesa() {
        return pontos_defesa;
    }

    public void setPontos_defesa(int pontos_defesa) {
        this.pontos_defesa = pontos_defesa;
    }

    public PosicaoFutsal getPosicao() {
        return posicao;
    }

    public void setPosicao(PosicaoFutsal posicao) {
        this.posicao = posicao;
    }

    public int getN_jogador() {
        return n_jogador;
    }

    public void setN_jogador(int n_jogador) {
        this.n_jogador = n_jogador;
    }

    

    
}
