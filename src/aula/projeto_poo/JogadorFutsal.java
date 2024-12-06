package aula.projeto_poo;


public class JogadorFutsal {
    private String nome;
    private int idade;
    private int numero;
    private int gols_totais;
    private int golsCampeonato;
    private int pontos_ataque = 0;
    private int pontos_defesa = 0;
    private PosicaoFutsal posicao;
    private int n_jogador = 0;


    public JogadorFutsal(String nome, int idade, PosicaoFutsal posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.gols_totais = 0;
        this.n_jogador = 0;

        gerarPontos();

        
       
    }

        
    private void gerarPontos() {
        java.util.Random random = new java.util.Random();
        this.pontos_ataque = random.nextInt(15) + 1; // Entre 1 e 15
        this.pontos_defesa = random.nextInt(15) + 1;

            // teste para o goleiro
        if (posicao == PosicaoFutsal.GOLEIRO && pontos_ataque >= 4 ) {
            this.pontos_ataque = 4;
        } else if (posicao == PosicaoFutsal.GOLEIRO && pontos_defesa < 10) {
            this.pontos_defesa = 10 ;
        } 

        // teste pata atacante
        if (posicao == PosicaoFutsal.PIVO && pontos_defesa >= 4) {
            this.pontos_defesa = 4;
        } else if (posicao == PosicaoFutsal.PIVO && pontos_ataque < 10) {
            this.pontos_ataque = 10;
        } 

    }

    public void registrarGol() {
        this.gols_totais += 1;
        this.golsCampeonato += 1;
    }
    public void reiniciarGolsCampeonato() {
        this.golsCampeonato = 0;
    }

    public void exibirPerfil() {
        System.out.println("///////////////////////////////");
        System.out.println("     Perfil do Jogador    ");
        System.out.println("////////////////////////////////");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Numero da camisa: " + numero );
        System.out.println("gols totais: " + gols_totais);
        System.out.println("gols de campeonato: " + golsCampeonato);
        System.out.println("ataque: " + pontos_ataque);
        System.out.println("defesa: " + pontos_defesa);
        System.out.println("posição: " + posicao);
    
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (this.idade >= 18  ) {
            this.nome = nome;

        }
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
        if (this.numero >= 1 && this.numero <= 20) {
            this.numero = numero;
        }
    }

    public int getGols_totais() {
        return gols_totais;
    }

    public void setGols_totais(int gols_totais) {
        this.gols_totais = gols_totais;
    }

    public int getGolsCampeonato() {
        return golsCampeonato;
    }

    public void setGolsCampeonato(int golsCampeonato) {
        this.golsCampeonato = golsCampeonato;
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
