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
        this.estatisticas = new Estatisticas(); 
        this.tecnico = null; 

       
    }

    public void contratarTecnico (TecnicoFutsal tecnico){
        
            this.tecnico = tecnico; // Atribui o técnico ao time
            System.out.println("Técnico " + tecnico.getNome() + " contratado com sucesso para o time " + this.nome);
       
    }

    public void contratarJogador(JogadorFutsal jogador) {
       
            if (this.jogadores.size() < 5) { // Limite de 5 jogadores
                this.jogadores.add(jogador); // Adiciona o jogador à lista
                System.out.println("Jogador " + jogador.getNome() + " contratado com sucesso para o time " + this.nome);
            }
    }

    public void gerarTimeRandom() {
          //nomes aleartorio para o  time
        // String[] nome_time= {"painsandur" , "America", "ABC", "Real", "Ribeirão", "Flamengo", "Fluminense"};
         // this.nome = nome_time[rand.nextInt(nome_time.length)];
       
       
       
       
       
         Random rand = new Random();

            // nomes aleatorios para o tecnico e os jogadores
        
        String[] nomesJogadores = {"Firmirno", "Romario", "Bruno", "Falcão", "Davi luis", "Muralha", "Roberto", "Pele", "Maradona", "Fernandinho"};
        PosicaoFutsal[] posicoes = {PosicaoFutsal.FIXO, PosicaoFutsal.ALA, PosicaoFutsal.ALA, PosicaoFutsal.GOLEIRO, PosicaoFutsal.PIVO}; 

        

            // repetiçao para colocar aleatorio as posiçaõ, idade e instaciar para o array de jogadores
        for(int i = 0; i < posicoes.length; i++) {
            String nome = nomesJogadores[rand.nextInt(nomesJogadores.length)] + "_" + (i + 1);
            int idade = rand.nextInt(15) + 18; 
            PosicaoFutsal posicao = posicoes[i];

            JogadorFutsal jogador = new JogadorFutsal(nome, idade, posicao);
            jogadores.add(jogador);
        }

        // instaciar o tecnico
        String nomeTecnico = "Tec_" + nomesJogadores[rand.nextInt(nomesJogadores.length)];
        int idadeTecnico = 35 + rand.nextInt(30); 
        tecnico = new TecnicoFutsal(nomeTecnico, idadeTecnico);

            // mostra time gerado
        System.out.println("Time gerado automaticamente: " + this.nome); 
        for (JogadorFutsal jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome() + ", Idade: " + jogador.getIdade() + ", Posicionamento: " + jogador.getPosicao() + ", Ataque: " + jogador.getPontos_ataque() + ", Defesa: " + jogador.getPontos_defesa());  
        }
        System.out.println("Técnico: " + tecnico.getNome() + ", Idade: " + tecnico.getIdade()); 

        
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

        int[] pontosAtaque = new int[jogadores.size()];
        int[] pontosAcumulados = new int[jogadores.size()];
    
        // Preenche o array de pontos de ataque
        for (int i = 0; i < jogadores.size(); i++) {
            pontosAtaque[i] = jogadores.get(i).getPontos_ataque();
        }
    
        // Determina qual jogador marcou o gol
        int indiceGoleador = goleador(pontosAtaque, pontosAcumulados);

         //  jogador que marcou o gol
        JogadorFutsal jogador = jogadores.get(indiceGoleador);

        // Incrementa os gols marcados pelo jogador e pelo time
        jogador.registrarGol(); 
        this.incrementaGolsMarcados(1);

        // Exibe uma mensagem com o nome do jogador 
        System.out.println("Gol marcado por: " + jogador.getNome());

    
    return indiceGoleador;
 }
    
 private int goleador(int [] pontosAtaque, int[] pontosAcumulados) {
    int totalPontosAtaque = 0;

    //  preenche o array  ponto acumulados
    for (int i = 0; i < pontosAtaque.length; i++) {
        totalPontosAtaque += pontosAtaque[i];
        pontosAcumulados[i] = totalPontosAtaque;
    }

     // pega um numero aleatorio totalPontosAtaque
     Random random = new Random();
     int pontoEscolhido = random.nextInt(totalPontosAtaque) + 1;
 
     // Determina o jogador com base nos pontos acumulados
     for (int i = 0; i < pontosAcumulados.length; i++) {
         if (pontoEscolhido <= pontosAcumulados[i]) {
             return i; 
         }
     }
 
     return -1; 
}
    
    public void exibirTime(){
        System.out.println("Time: " + this.nome);
        System.out.println("tecnico: " + tecnico.getNome());
        System.out.println("\nJogadores:");
        for (JogadorFutsal jogador : jogadores) {
            System.out.println(" - Nome: " + jogador.getNome() + 
                               " | Idade: " + jogador.getIdade() + 
                               " | Posição: " + jogador.getPosicao() + 
                               " | Número: " + jogador.getNumero() +
                               " | Ataque: " + jogador.getPontos_ataque() + 
                               " | Defesa: " + jogador.getPontos_defesa());
        }


        
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
        for (JogadorFutsal jogador : jogadores) { 
            if (jogador.getNumero() ==  numero ) { 
                
                System.out.println("Jogador encontrado!");
                System.out.println("Nome: " + jogador.getNome());
                System.out.println("Idade: " + jogador.getIdade());
                System.out.println("Posição: " + jogador.getPosicao());
                System.out.println("Número da camisa: " + jogador.getNumero());
                System.out.println("Pontos de Ataque: " + jogador.getPontos_ataque());
                System.out.println("Pontos de Defesa: " + jogador.getPontos_defesa());
                break; 
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