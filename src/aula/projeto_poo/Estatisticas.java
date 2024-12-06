package aula.projeto_poo;

public class Estatisticas {
    private int titulo = 0;
    private int jogo = 0;
    private int pontos = 0;
    private int vitorias = 0;
    private int empates = 0;
    private int derrotas = 0;
    private int golsMarcados = 0;
    private int gols_sofridos = 0;
    

 
 
    public void reiniciarEstatisticas() {

        this.titulo = 0;
        this.jogo = 0;
        this.pontos = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.golsMarcados = 0;
        this.gols_sofridos = 0;
    }

    public void incrementarTitulos() {
        this.setTitulo(this.getTitulo() + 1); 
    }

    public void incrementarGolsMarcados(int golsMarcados) {
        this.setGolsMarcados(this.getGolsMarcados() + golsMarcados);
    }

    public void incrementarGols_Sofridos( int gols_sofridos) {
        this.setGols_sofridos(this.getGols_sofridos() + gols_sofridos);
    }

    public void incrementarVitorias() {
       this.setVitorias(this.getVitorias() + 1); 
       this.incrementarPontos(3);
       
    }

    public void incrementarEmpates() {
        this.setEmpates(this.getEmpates() + 1);
        this.incrementarPontos(1);
    }

    public void incrementarDerrotas() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    
    private void incrementarPontos (int pontos) {
        this.pontos += pontos;
    }

    public int saldoGols() {
        return this.golsMarcados - this.gols_sofridos;
    }

    public void exibirEstatistica() {

        System.out.println("//////////////////////////////////////////");
        System.out.println("                ESTATISTICAS           ");
        System.out.println("//////////////////////////////////////////");
        System.out.println(" titulos: " + getTitulo());
        System.out.println("jogos " + getJogo());
        System.out.println("Pontos " + getPontos());
        System.out.println("Vitorias " + getVitorias());
        System.out.println("empates " + getEmpates());
        System.out.println("Derrotas " + getDerrotas());
        System.out.println("gols marcardos " + getGolsMarcados());
        System.out.println("Gols sofridos " + getGols_sofridos());
    }
    @Override
    public String toString() {
         int saldoDeGols = this.golsMarcados - this.gols_sofridos;
    return String.format(
        "Vitórias: %d | Derrotas: %d | Empates: %d | Gols Marcados: %d | Gols Sofridos: %d | Saldo de Gols: %d",
        this.vitorias,
        this.derrotas,
        this.empates,
        this.golsMarcados,
        this.gols_sofridos,
        saldoDeGols
    );
    }

    /**
     * @return int return the titulo
     */
    public int getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }



    /**
     * @return int return the jogo
     */
    public int getJogo() {
        return jogo;
    }

    /**
     * @param jogo the jogo to set
     */
    public void setJogo(int jogo) {
        this.jogo = jogo;
    }



    /**
     * @return int return the pontos
     */
    public int getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }



    /**
     * @return int return the vitorias
     */
    public int getVitorias() {
        return vitorias;
    }

    /**
     * @param vitorias the vitorias to set
     */
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }



    /**
     * @return int return the empates
     */
    public int getEmpates() {
        return empates;
    }

    /**
     * @param empates the empates to set
     */
    public void setEmpates(int empates) {
        this.empates = empates;
    }



    /**
     * @return int return the golsMarcados
     */
    public int getGolsMarcados() {
        return golsMarcados;
    }

    /**
     * @param golsMarcados the golsMarcados to set
     */
    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }



    /**
     * @return int return the gols_sofridos
     */
    public int getGols_sofridos() {
        return gols_sofridos;
    }

    /**
     * @param gols_sofridos the gols_sofridos to set
     */
    public void setGols_sofridos(int gols_sofridos) {
        this.gols_sofridos = gols_sofridos;
    }


    /**
     * @return int return the derrotas
     */
    public int getDerrotas() {
        return derrotas;
    }

    /**
     * @param derrotas the derrotas to set
     */
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

}
