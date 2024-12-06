package aula.projeto_poo;

import java.util.ArrayList;
import java.util.Random;

public class TimeFutsal {
    
    private  String nome;
    private ArrayList <JogadorFutsal> jogadores;
    private TecnicoFutsal tecnico;
    private Estatisticas estatisticas;
    
    public TimeFutsal (String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
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
        java.util.List<Integer> numeros = new java.util.ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }
        java.util.Collections.shuffle(numeros); // Embaralha os números
    
        // Gerando até 5 jogadores aleatórios
        for (int i = 0; i < 5; i++) { // Máximo de 5 jogadores
            String nomeJogador = "Jogador " + (random.nextInt(100) + 1);
            int idadeJogador = random.nextInt(10) + 18; // Idade entre 18 e 27
            PosicaoFutsal[] posicoes = PosicaoFutsal.values();
            PosicaoFutsal posicaoJogador = posicoes[random.nextInt(posicoes.length)];
            int numero = numeros.remove(0); // Remove o primeiro número disponível
    
            // Criando o jogador com número de camisa único
            JogadorFutsal jogador = new JogadorFutsal(nomeJogador, idadeJogador, posicaoJogador);
            jogador.setNumero(numero);
    
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
    
    public void incrementaGolsMarcados (int golsMarcados) {
       this.estatisticas.setGolsMarcados(this.estatisticas.getGols_sofridos() + golsMarcados);
    }

    public void incrementaGolsSofridos ( int golsSofridos) {
        this.estatisticas.setGols_sofridos(this.estatisticas.getGols_sofridos() + golsSofridos);
    }

    public int pontosAtaque() {
        int totalPontosAtaque = 0;

    // Soma os pontos de ataque de todos os jogadores
    for (JogadorFutsal jogador : jogadores) {
        totalPontosAtaque += jogador.getPontos_ataque();
    }
    
    // Adiciona os pontos de especialidade do técnico se ele for ofensivo
    if (tecnico.getEspecialidade() == Especialidade.OFENSIVA) {
        totalPontosAtaque += tecnico.getPontosEspecialidade();
    }

    return totalPontosAtaque;
    }
    public int pontosDefesa () {
        int totalPontosDefesa = 0;

        // Soma os pontos de defesa de todos os jogadores
        for (JogadorFutsal jogador : jogadores) {
            totalPontosDefesa += jogador.getPontos_defesa();
        }
    
        // Adiciona os pontos de especialidade do técnico se ele for defensivo
        if (tecnico != null && tecnico.getEspecialidade() == Especialidade.DEFENSIVA) {
            totalPontosDefesa += tecnico.getPontosEspecialidade();
        }
    
        return totalPontosDefesa;
    }
    

    public int registrarGol () {
    // Chama o método goleador para determinar qual jogador marcou o gol
    int indiceGoleador = goleador(null, null);

    // Verifica se o índice do goleador é válido
    if (indiceGoleador == -1) {
        System.out.println("Erro: Não foi possível determinar o goleador.");
        return -1; // Retorna -1 em caso de erro
    }

    // Obtém o jogador que marcou o gol
    JogadorFutsal jogador = this.jogadores.get(indiceGoleador);

    // Registra o gol para o jogador (presumindo que o método registrarGol() exista em JogadorFutsal)
    jogador.registrarGol(); 

    // Incrementa os gols do time
    this.incrementaGolsMarcados(1);

    // Exibe uma mensagem com o nome do jogador que marcou
    System.out.println("Gol marcado por: " + jogador.getNome());

    // Retorna o índice do jogador que marcou o gol
    return indiceGoleador;
 }
    
 private int goleador(int[] pontosAtaque, int[] pontosAcumulados) {
    Random random = new Random();
    
    // Calcula o total de pontos de ataque
    int totalPontosAtaque = 0;
    for (int pontos : pontosAtaque) {
        totalPontosAtaque += pontos;  // Somando os pontos de ataque de cada jogador
    }

    // Gera um número aleatório entre 1 e totalPontosAtaque
    int pontoEscolhido = random.nextInt(totalPontosAtaque) + 1;

    // Percorre os pontos acumulados para encontrar o jogador que marcou o gol
    for (int i = 0; i < pontosAcumulados.length; i++) {
        if (pontosAcumulados[i] >= pontoEscolhido) {
            return i;  // Retorna o índice do jogador que marcou o gol
        }
    }

    return -1;  // Retorna -1 caso ocorra algum erro
}
    
    public void exibirTime(){
        System.out.println("Time: " + this.nome);
        System.out.println("tecnico: " + tecnico.getNome());
        System.out.println("Jogadores:");
        
    }
    public void exibirTecnico() {
       this.tecnico.exibirPerfil();
    }
    public void exibirJogadores() {
        for (JogadorFutsal jogador : jogadores) {
            System.out.println("Jogador " + jogador.getNome());
        }
    }
    public void exibirJogador(int numero) {
        for (JogadorFutsal jogador : jogadores) { // Percorre a lista de jogadores
            if (jogador.getNumero() ==  numero ) { // Compara o número da camisa
                // Exibe as informações do jogador
                System.out.println("Jogador encontrado!");
                System.out.println("Nome: " + jogador.getNome());
                System.out.println("Idade: " + jogador.getIdade());
                System.out.println("Posição: " + jogador.getPosicao());
                System.out.println("Número da camisa: " + jogador.getNumero());
                System.out.println("Pontos de Ataque: " + jogador.getPontos_ataque());
                System.out.println("Pontos de Defesa: " + jogador.getPontos_defesa());
                break; // Sai do loop após encontrar o jogador
            }
        }
    }
    public void exibirEstatisticas(){
        this.estatisticas.exibirEstatistica();
    }
    public void exibirEstatisticasLinha() {
        System.out.println("Time: " + this.nome + " | " + this.estatisticas.toString());
    }


    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<JogadorFutsal> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<JogadorFutsal> jogadores) {
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