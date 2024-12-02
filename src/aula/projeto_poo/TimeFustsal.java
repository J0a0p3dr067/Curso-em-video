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

        // Criando um técnico aleatório
        int idadeTecnico = 30 + random.nextInt(25); // Idade entre 30 e 54
        // Gerando a especialidade e os pontos de especialidade aleatoriamente
        Especialidade[] especialidades = Especialidade.values();
        Especialidade especialidadeAleatoria = especialidades[random.nextInt(especialidades.length)];
        int pontosEspecialidade = random.nextInt(5) + 1; // Pontos de 1 a 5
        TecnicoFutsal tecnicoAleatorio = new TecnicoFutsal("Técnico " + (random.nextInt(100) + 1), idadeTecnico);
        tecnicoAleatorio.setEspecialidade(especialidadeAleatoria);
        tecnicoAleatorio.setPontosEspecialidade(pontosEspecialidade);
        this.contratarTecnico(tecnicoAleatorio);
    
        // Gerando números de camisas de 1 a 20 sem repetição
        java.util.List<Integer> numerosCamisas = new java.util.ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numerosCamisas.add(i);
        }
        java.util.Collections.shuffle(numerosCamisas); // Embaralha os números
    
        // Gerando até 5 jogadores aleatórios
        for (int i = 0; i < 5; i++) { // Máximo de 5 jogadores
            String nomeJogador = "Jogador " + (random.nextInt(100) + 1);
            int idadeJogador = random.nextInt(10) + 18; // Idade entre 18 e 27
            PosicaoFutsal[] posicoes = PosicaoFutsal.values();
            PosicaoFutsal posicaoJogador = posicoes[random.nextInt(posicoes.length)];
            int numeroCamisa = numerosCamisas.remove(0); // Remove o primeiro número disponível
    
            // Criando o jogador com número de camisa único
            JogadorFutsal jogador = new JogadorFutsal(nomeJogador, idadeJogador, posicaoJogador);
            jogador.setNumero(numeroCamisa);
    
            // Contratando o jogador
            this.contratarJogador(jogador);
        }
    
        System.out.println("Time " + this.nome + " gerado com sucesso!");
    }
    

    public void registrarVitoria() {
    this.estatisticas.incrementarVitorias();

    }

    public void registrarDerrota() {
        this.estatisticas.incrementarDerrotas();
    }

    public void registrarEmpate() {
       this.estatisticas.incrementarEmpates();
    }

    public void incrementaGolsMarcados (int incrementaGolsMarcados) {
       this.estatisticas.setGols_marcados(this.estatisticas.getGols_marcados() + incrementaGolsMarcados);
    }

    public void incrementaGolsSofrido ( int golsSofrido) {
        this.estatisticas.setGols_sofridos(this.estatisticas.getGols_sofridos() + golsSofrido);
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