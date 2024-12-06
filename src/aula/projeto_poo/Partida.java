package aula.projeto_poo;

public class Partida {
    private TimeFutsal timeA;
    private TimeFutsal timeB;
    private Resultado resultado;

    Partida(TimeFutsal timeA, TimeFutsal timeB) {
        if(timeA != null && timeB != null) {
            this.timeA = timeA;
            this.timeB = timeB;            
        }

        this.resultado = new Resultado();
    }

    public Resultado getResultado() {
        return this.resultado;
    }

    public Resultado realizarPartida(int turnos) {
        int ataqueA = this.timeA.pontosAtaque();
        int defesaA = this.timeA.pontosDefesa();

        int ataqueB = this.timeA.pontosAtaque();
        int defesaB = this.timeB.pontosDefesa();

        int dadosA, dadosB;

        for(int i = 0; i < turnos; i++) {
            if(i % 2 == 0) {
                dadosA = UtilPontos.lancarDados(ataqueA);
                dadosB = UtilPontos.lancarDados(defesaB);

                //System.out.println(" AtaqueA " + defesaA + " " + ataqueB + " " + dadosA + " " + dadosB);

                if(dadosA > dadosB) {
                    this.resultado.incrementaGolsA();
                    //System.out.println(" GOOOOOOL " + timeA.getNome() + "!!");
                    
                    timeA.registrarGol();
                    //JogadorFutsal goleador = timeA.registrarGol();       
                    //System.out.println(" " + goleador.getNome());  
                }                
            } else {
                dadosA = UtilPontos.lancarDados(defesaA);
                dadosB = UtilPontos.lancarDados(ataqueB);

                //System.out.println(" AtaqueB " + defesaA + " " + ataqueB + " " + dadosA + " " + dadosB);

                if(dadosB > dadosA) {
                    this.resultado.incrementaGolsB();
                    //System.out.println(" GOOOOOOL " + timeB.getNome() + "!!");
                    
                    timeB.registrarGol();
                    //JogadorFutsal goleador = timeB.registrarGol();       
                    //System.out.println(" " + goleador.getNome());  
                }
            }
        }

        return resultado;
    }

    public void exibirPartida(boolean comResultado) {      
        if(comResultado) {
            System.out.println("     " + this.timeA.getNome() + " [" + this.resultado.getGolsA() 
            + "] x [" + this.resultado.getGolsB() + "] " + this.timeB.getNome());
        } else {
            System.out.println("     " + this.timeA.getNome() + " [ ] x [ ] " + this.timeB.getNome());
        }
    }

    public TimeFutsal getTimeA() {
        return this.timeA;
    }

    public TimeFutsal getTimeB() {
        return this.timeB;
    }
}
