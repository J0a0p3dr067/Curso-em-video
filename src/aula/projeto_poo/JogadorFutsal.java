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

    
}
