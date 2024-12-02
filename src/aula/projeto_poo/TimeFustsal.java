package aula.projeto_poo;

import java.util.Random;

public class TimeFustsal {
    
    private  String nome;
    private java.util.ArrayList jogadores;
    private TecnicoFutsal tecnico;
    private Estatisticas estatisticas;
    
    public TimeFustsal (String nome) {
        this.nome = nome;
        this.jogadores = new java.util.ArrayList();
        this.estatisticas = new Estatisticas(); // Inicializa as estatísticas do time
        this.tecnico = null; // Inicialmente o técnico é nulo

       
    }

    public void contratarTecnico (TecnicoFutsal tecnico){
        

         // Verifica se o técnico passado não é nulo
         if (tecnico != null) {
            this.tecnico = tecnico; // Atribui o técnico ao time
            System.out.println("Técnico " + tecnico.getNome() + " contratado com sucesso para o time " + this.nome);
        } else {
            System.out.println("Técnico inválido!");
        }
    }

    public void contratarJogador(JogadorFutsal jogador) {

        if (jogador != null) {
            if (this.jogadores.size() < 5) { // Limite de 5 jogadores
                this.jogadores.add(jogador); // Adiciona o jogador à lista
                System.out.println("Jogador " + jogador.getNome() + " contratado com sucesso para o time " + this.nome);
            } else {
                System.out.println("Limite de jogadores atingido. Não é possível contratar mais.");
            }
        } else {
            System.out.println("Jogador inválido!");
        }
    }

    public void gerarTimeRandom() {
          Random random = new Random();
        
       
 
         // Gerando jogadores aleatórios
         for (int i = 0; i < 20; i++) { // Criando 20 jogadores aleatórios
             String nomeJogador = "Jogador " + (random.nextInt(100) + 1); // Nome aleatório
             int idadeJogador = random.nextInt(10) + 18; // Idade aleatória entre 18 e 27
             PosicaoFutsal[] posicoes = PosicaoFutsal.values(); // Posições possíveis (PIVO, GOLEIRO, ATACANTE, etc.)
             PosicaoFutsal posicaoJogador = posicoes[random.nextInt(posicoes.length)]; // Posição aleatória
             JogadorFutsal jogador = new JogadorFutsal(nomeJogador, idadeJogador, posicaoJogador);
 
             // Contratando o jogador
             this.contratarJogador(jogador);
         }
 
         System.out.println("Time " + this.nome + " gerado com sucesso!");
     }
 
    

    public void registrarVitoria() {
        this.registrarVitoria();
    }

    public void registrarDerrota() {
        this.registrarDerrota();
    }

    public void registrarEmpate() {
        this.registrarEmpate();
    }

    public void incrementaGolsMarcados (int incrementaGolsMarcados) {
       
    }

    public void incrementaGolsSofrido ( int golsSofrido) {

    }

    // public int pontoAtaque() {

    // }
    // public int pontosDefesa () {

    // }

    // public int registrarGol () {

    // }
    // private int goleador(int pontosAtaque int[] pontosAcumulados) {

    // }
    public void exibirTime(){
        System.out.println("Time: " + this.nome);
        System.out.println("Técnico: " + (this.tecnico != null ? this.tecnico.getNome() : "Nenhum técnico"));
        System.out.println("Jogadores:");
        
    }
    public void exibirTecnico() {
        this.exibirTecnico();
    }
    public void exibirJogadores() {
        
    }
    public void exibirJogador(int numero) {
        
    }
    public void exibirEstatisticas(){
        this.exibirEstatisticas();
    }
    public void exibirEstatisticasLinhas() {
       this.toString();
    }


    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.util.ArrayList getJogadores() {
        return jogadores;
    }

    public void setJogadores(java.util.ArrayList jogadores) {
        this.jogadores = jogadores;
    }

    public TecnicoFutsal getTecnico() {
        return tecnico;
    }

    public void setTecnico(TecnicoFutsal tecnico) {
        this.tecnico = tecnico;
    }

    public Estatisticas getEstatisticas() {
        return estatisticas;
    }

    public void setEstatisticas(Estatisticas estatisticas) {
        this.estatisticas = estatisticas;
    }
    
    

}