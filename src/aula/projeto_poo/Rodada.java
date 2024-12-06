package aula.projeto_poo;

import java.util.ArrayList;

public class Rodada {
    ArrayList<Partida> partidas;

    Rodada() {
        this.partidas = new ArrayList<Partida>();
    }

    public void adicionarPartida(Partida partida) {
        if(partida != null) {
            this.partidas.add(partida);
        }
    }

    public void limparRodada() {
        this.partidas.clear();
    }

    public ArrayList<Resultado> realizarRodada() {
        if(this.partidas.size() > 0) { 
            ArrayList<Resultado> resultados = new ArrayList<Resultado>();
            
            for(Partida partida : partidas) {
                Resultado resultado = partida.realizarPartida(8);
                resultados.add(resultado);
                
                TimeFutsal timeA = partida.getTimeA();
                TimeFutsal timeB = partida.getTimeB();

                int golsA = resultado.getGolsA();
                int golsB = resultado.getGolsB();

                if(golsA > golsB) {
                    timeA.registrarVitoria();
                    timeB.registrarDerrota();
                } else if (golsA < golsB) {
                    timeA.registrarDerrota();
                    timeB.registrarVitoria();
                } else {
                    timeA.registrarEmpate();
                    timeB.registrarEmpate();                    
                }

                timeA.incrementaGolsMarcados(golsA);
                timeA.incrementaGolsSofridos(golsB);
                
                timeB.incrementaGolsMarcados(golsB);
                timeB.incrementaGolsSofridos(golsA);                
            }            
            
            return resultados;
        }

        return null;
    }

    public void exibirPartidasRodada(boolean comResultado) {    
        for(Partida partida : this.partidas) {
            partida.exibirPartida(comResultado);
        }
    }

    public ArrayList<Partida> getPartidas() {
        return this.partidas;
    }
}